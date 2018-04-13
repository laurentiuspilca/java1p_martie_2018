import java.util.*;

public class Exemplu7 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        
        //list
        //.parallelStream()
        //.filter(n -> n % 2 == 0)
        //.forEach(System.out::println);
        
        list.stream()
        .filter(n -> n % 2 == 0)
        .parallel()
        .forEachOrdered(System.out::println);
    }
}