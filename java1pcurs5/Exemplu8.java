import java.util.*;

public class Exemplu8 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("aaa", "bb", "ccccc", "ddd", "eeee");
        
        list.stream()
            .map(s -> s.length())
            .parallel()
            .filter(x -> x % 2 == 0)
            .forEach(System.out::println);
    }
}