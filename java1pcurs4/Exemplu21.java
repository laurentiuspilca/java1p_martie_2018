import java.util.concurrent.*;

public class Exemplu21 {

    public static void main(String [] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newCachedThreadPool();
        
        Future<String> f = service.submit(() -> "PIZZA");
        
        // NE PLIMBAM PRIN MALL
        
        try {
            String res = f.get(); 
            System.out.println(res);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        
        service.shutdown();
    }
}