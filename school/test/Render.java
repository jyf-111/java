import javax.swing.SwingUtilities;

public class Render implements Runnable{
    private final FileQueue queue;
    private final MainPanel panel;
    Render(FileQueue queue,MainPanel panel){
        this.queue = queue;
        this.panel = panel;
    }
    @Override
    public void run(){
        while(!Thread.interrupted()){
            FilePair pair = this.queue.getPair();
            if(pair!=null){
                if(pair.getParent()==pair.getChild()){
                    SwingUtilities.invokeLater(new Runnable(){
                        @Override
                        public void run(){
                            panel.onFinish();
                        }
                    });
                    break;
                }else {
                    SwingUtilities.invokeLater(new Runnable(){
                        @Override
                        public void run(){
                            panel.onFilePair(pair);
                        }
                    });
                    synchronized(FileQueue.SCANNER){
                        FileQueue.SCANNER.notify();
                    }
                    continue;
                }
            }
            synchronized(FileQueue.RENDR){
                try{
                    FileQueue.RENDR.wait();
                }catch(InterruptedException e){
                    break;
                }
            }
        }
    }
}
