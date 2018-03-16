import java.util.*;
import java.util.stream.*;

public class Exemplu24 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Hello", "my", "good", "friend!");
        
        list.stream()
            .map(s -> s.length())
            .filter(v -> v % 2 == 0)
            .forEach(System.out::println);
    }
}