import java.util.*;
import java.util.stream.*;

public class Exemplu6 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Hello", "World");
        
        List<Integer> lengths = 
            list.stream()
                .map(x -> x.length())
                .collect(Collectors.toList());
                
        System.out.println(lengths);        
    }

}