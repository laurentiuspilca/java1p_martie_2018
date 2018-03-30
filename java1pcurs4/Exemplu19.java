import java.util.concurrent.*;

public class Exemplu19 {

    public static void main(String [] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);
        
        Future<?> f = service.submit(() -> System.out.println("Hello world"));
        
        try {
            f.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        service.shutdown();
    }
}