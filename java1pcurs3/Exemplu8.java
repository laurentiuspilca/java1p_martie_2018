import java.util.*;
import java.util.stream.*;

public class Exemplu8 {

    public static void main(String [] args) {
        Random r = new Random();
        Stream<Integer> s = Stream.generate(() -> r.nextInt(1000));
        
        s.limit(10).forEach(System.out::println);
    }
}