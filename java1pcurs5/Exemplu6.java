import java.util.*;
import java.util.concurrent.*;

public class Exemplu6 {

    public static void main(String [] args) {
        ForkJoinPool pool = new ForkJoinPool();
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        DisplayListAction a = new DisplayListAction(list);
        
        pool.invoke(a);
    }
}