import java.util.stream.*;
import java.util.*;

public class Exemplu1 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("abc","hgt","zde", "bnm", "rty");
        
        list.stream()
            .sorted( (s1,s2) -> s2.compareTo(s1) )
            .forEach(System.out::println);
    }
}