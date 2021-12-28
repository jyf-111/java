import java.io.File;

/**
 * Scanner
 */
public class Scanner_ implements Runnable{
    private final FileQueue queue;
    private final File where;
    
    public Scanner_(FileQueue queue,File where){
        this.queue = queue;
        this.where = where;
    }

    @Override
    public void run() {
        boolean running = true;
        File[] files  = where.listFiles();
        for(File file:files){
            FilePair pair = new FilePair(where,file);

            running = queue(pair);
            if(!running) {
				break;
			}
        }
        FilePair pair = new FilePair(where, where);
		queue(pair);
    }

   private boolean queue(FilePair pair) {
		while(true) {
			if(this.queue.addPair(pair)) {
				synchronized(FileQueue.RENDR) {
					FileQueue.RENDR.notify();
				}
				return true;
			}
				
			synchronized(FileQueue.SCANNER) {
				try {
					FileQueue.SCANNER.wait();
				} catch(InterruptedException e) {
					return false;
				}
			}
		}
	} 

    
}