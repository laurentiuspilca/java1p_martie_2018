import java.util.concurrent.*;

public class Exemplu18 {

    public static void main(String [] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        service.execute(() -> System.out.println("HELLO WORLD!"));
        
        //service.shutdownNow();
        service.shutdown();
    }
}