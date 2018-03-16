import java.util.stream.*;

public class Exemplu31 {

    public static void main(String [] args) {
        Stream.iterate(1, i -> i+1)
            .limit(10)
            .forEach(System.out::println);
    }
}