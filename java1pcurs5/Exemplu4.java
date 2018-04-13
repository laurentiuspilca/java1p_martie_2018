import java.util.concurrent.*;

public class Exemplu4 {

    public static void main(String [] args) {
        FibboTask task = new FibboTask(6);
        
        ForkJoinPool pool = new ForkJoinPool();
        int n = pool.invoke(task);
        
        System.out.println(n);
    }
}