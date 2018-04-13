import java.util.concurrent.atomic.*;

public class Exemplu9 {

    public static void main(String [] args) {
        NumarAtomic n = new NumarAtomic();
        int x = n.incrementAndGet();
        
        AtomicInteger n2 = new AtomicInteger(0);
        int x2 = n2.incrementAndGet(); // x++ 
        int x3 = n2.addAndGet(5); // x+=5
        int x4 = n2.addAndGet(-5); // x-=5
    }
}