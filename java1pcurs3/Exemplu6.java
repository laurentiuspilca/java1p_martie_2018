import java.util.*;
import java.util.stream.*;

public class Exemplu6 {

    public static void main(String [] args) {
        Stream<Integer> s1 = Stream.empty();
        
        Stream<Integer> s2 = Stream.of(1,2,5,8,9);
        s2.forEach(System.out::println);
        
        
        Stream<Integer> s3 = Stream.iterate(1, i -> i+1);
        s3.limit(10).forEach(System.out::println);
        
        Stream<Integer> s4 = Stream.generate(() -> 1);
        s4.limit(10).forEach(System.out::println);
    }
}