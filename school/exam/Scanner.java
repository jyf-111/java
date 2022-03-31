package school.exam;

import java.io.File;

public class Scanner implements Runnable {
    private final FileQueue queue;

    private final File where;

    public Scanner(FileQueue queue, File where) {
        this.queue = queue;
        this.where = where;
    }

    @Override
    public void run() {
        boolean running = true;

        File[] files = where.listFiles();
        for (File file : files) {
            FilePair pair = new FilePair(where, file);

            running = queue(pair);

            if (!running) {
                break;
            }
        }

        FilePair pair = new FilePair(where, where);
        queue(pair);
    }

    private boolean queue(FilePair pair) {
        while (true) {
            if (this.queue.addPair(pair)) {
                synchronized (FileQueue.RENDER) {
                    FileQueue.RENDER.notify();
                }
                return true;
            }

            synchronized (FileQueue.SCANNER) {
                try {
                    FileQueue.SCANNER.wait();
                } catch (InterruptedException e) {
                    return false;
                }
            }
        }
    }
}
