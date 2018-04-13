public class NumarAtomic {

    private int x;
    
    public void increment() {
        x++;
    }
    
    public int get() {
        return x;
    }
    
    public synchronized int incrementAndGet() {
        increment();
        return get();
    }
}