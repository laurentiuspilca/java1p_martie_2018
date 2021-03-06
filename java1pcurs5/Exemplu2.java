import java.util.concurrent.*;

public class Exemplu2 {

    public static void main (String [] args) throws Exception {
        ScheduledExecutorService service = 
            Executors.newSingleThreadScheduledExecutor();
            
        service.scheduleAtFixedRate(
            () -> System.out.println("HELLO"), 1, 2, TimeUnit.SECONDS);
        
        Thread.sleep(10000);
            
        service.shutdown();
    }
}