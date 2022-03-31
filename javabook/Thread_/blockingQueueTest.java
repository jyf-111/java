import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class blockingQueueTest {

    private static final int FILE_QUEUE_SIZE = 10;
    private static final int SEARCH_THREADS = 100;
    private static final Path DUMMY = Path.of("");
    private static BlockingQueue<Path> queue = new ArrayBlockingQueue<>(FILE_QUEUE_SIZE);
    
    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            System.out.print("Enter base directory(e.g. /opt/jdk-9-src) : ");
            String directory = in.nextLine();
            System.out.print("Enter keyword (e.g. volatile):");
            String keyword = in.nextLine();

            Runnable enumerator = () -> {
                try {
                    enumerate(Path.of(directory));
                    queue.put(DUMMY);
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (InterruptedException e){
                    
                }
            };

            new Thread(enumerator).start();
            for(int i=0 ;i<SEARCH_THREADS;i++){
                Runnable search = () -> {
                    try {
                        var done = false;
                        while(!done){
                            Path file = queue.take();
                            if(file == DUMMY){
                                queue.put(file);
                                done = true;
                            }else{
                                search(file,keyword);
                            }
                        }
                    } catch (IOException e) {
                    
                    } catch (InterruptedException e){

                    }
                };
                new Thread(search).start();
            }
        }
    }

    public static void enumerate(Path directory) throws IOException,InterruptedException {
        try (Stream<Path> children = Files.list(directory)) {
            for(Path child : children.collect(Collectors.toList())){
                if(Files.isDirectory(child)){
                    enumerate(child);
                }else{
                    queue.put(child);
                }
            }
        } catch (Exception e) {
        }
    }
    public static void search(Path file,String keyword) throws IOException {
        try(var in = new Scanner(file,StandardCharsets.UTF_8)){
            int lineNumber = 0;
            while(in.hasNextLine()){
                lineNumber++;
                String line = in.nextLine();
                if(line.contains(keyword)){
                    System.out.printf("%s:%d:%s\n",file,lineNumber,line);
                }
            }  
        }
    }
}