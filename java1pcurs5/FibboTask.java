import java.util.concurrent.*;

public class FibboTask extends RecursiveTask<Integer> {

    private final int w;
    
    public FibboTask(int w) {
        this.w = w;
    }
    
    @Override
    public Integer compute() {
        if (w <= 2) {
            return 1;
        }
        
        FibboTask t1 = new FibboTask(w-1);
        FibboTask t2 = new FibboTask(w-2);
        
        t2.fork();
        
        return t1.compute() + t2.join();
    }
}