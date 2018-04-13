import java.util.concurrent.*;

public class Exemplu1 {

    public static void main (String [] args) throws Exception {
        ScheduledExecutorService service = 
            Executors.newSingleThreadScheduledExecutor();
            
        service.schedule(
            () -> System.out.println("HELLO"), 4, TimeUnit.SECONDS);
        
        Thread.sleep(10000);
            
        service.shutdown();
    }
}