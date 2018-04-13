import java.util.concurrent.locks.*;
import java.util.concurrent.*;

public class Numar {

    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private Semaphore sem = new Semaphore(1);
    private int x;
    
    public void increment() {
        try {
            lock.writeLock().lock();
            x++;
        } finally {
            lock.writeLock().unlock();
        }
    }
    
     public void add(int x, boolean sync) throws Exception {
        try {
            if (sync) sem.acquire();
            this.x = x;
        } finally {
            if (sync) sem.release();
        }
    }
    
    public int get() {
        try {
            lock.readLock().lock();
            return x;
        } finally {
            lock.readLock().unlock();
        }
    }
}