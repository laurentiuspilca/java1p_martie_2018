import java.util.concurrent.*;

public class ServerManager {
    
    private Semaphore sem = new Semaphore(10, false);

    public void call() {
        try {
            sem.acquire();
            System.out.println("Calling server!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
    }
}