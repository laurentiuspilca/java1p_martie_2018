import java.util.*;
import java.util.stream.*;

public class Exemplu16 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,8,9,3,5,8,2,6,7);
        
        Map<Boolean, List<Integer>> map = 
            list.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
                
        System.out.println(map);        
    }
}