import java.util.LinkedList;
import java.util.List;

public class FileQueue {
	public static final Object RENDER = new Object();

	public static final Object SCANNER = new Object();

	private static final int LIMIT = 3;

	private final List<FilePair> queue;

	private final Object locker;

	public FileQueue() {
		this.queue = new LinkedList<>();
		this.locker = new Object();
	}

	public boolean addPair(FilePair pair) {
		synchronized(this.locker) {
			if(this.queue.size() >= LIMIT) {
				return false;
			}
			this.queue.add(pair);
			return true;
		}
	}

	public FilePair getPair() {
		synchronized(this.locker) {
			if(this.queue.isEmpty()) {
				return null;
			}
			
			return this.queue.remove(0);
		}
	}
}
