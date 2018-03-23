import java.util.stream.*;

public class Exemplu7 {

    public static void main(String [] args) {
        Stream<Integer> s = Stream.iterate(0, i -> i + 2);
        s.limit(10).forEach(System.out::println);
    }
}