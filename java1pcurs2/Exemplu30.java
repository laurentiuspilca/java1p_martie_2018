import java.util.stream.*;
import java.util.*;

public class Exemplu30 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        
        int sum1 = list.stream().reduce(0, (a,b) -> a+b);
        int sum2 = list.stream().mapToInt(x -> x).sum();
        
        System.out.println(sum1);
        System.out.println(sum2);
    }
}