import java.util.*;
import java.util.stream.*;

public class Exemplu4 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("hello", "my", "friend");
        
        list.stream().map(String::length).forEach(System.out::println);
        
        long sum = list.stream().mapToInt(s -> s.length()).sum();
    }
}