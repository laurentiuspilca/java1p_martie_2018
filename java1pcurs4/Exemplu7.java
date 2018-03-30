import java.util.*;
import java.util.stream.*;

public class Exemplu7 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Hello", "World");
        
        Set<Integer> lengths = 
            list.stream()
                .map(x -> x.length())
                .collect(Collectors.toSet());
                
        System.out.println(lengths);        
    }

}