import java.util.concurrent.*;

public class Exemplu20 {

    public static void main(String [] args) {
        int n = Runtime.getRuntime().availableProcessors();
        ExecutorService service = Executors.newFixedThreadPool(n);
        
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