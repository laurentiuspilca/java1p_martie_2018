import java.util.stream.*;
import java.util.*;

public class Exemplu3 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,5,6,7,8);
        
        long sum = list.stream().mapToInt(x -> x).sum();
        OptionalDouble avg = list.stream().mapToInt(x -> x).average();
        
        
    }
}