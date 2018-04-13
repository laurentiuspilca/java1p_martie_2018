import java.util.concurrent.*;
import java.util.*;

public class Exemplu5 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,6,7,9,2,3,4,6,8,2,3,8,9);
        
        ForkJoinPool pool = new ForkJoinPool();
        ListSumTask task = new ListSumTask(list);
        
        int sum = pool.invoke(task);
        
        System.out.println(sum);
    }
}