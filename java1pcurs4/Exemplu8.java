import java.util.*;
import java.util.stream.*;

public class Exemplu8 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Hello", "World");
        
        ArrayList<Integer> lengths = 
            list.stream()
                .map(x -> x.length())
                .collect(Collectors.toCollection(ArrayList::new));
                
        System.out.println(lengths);        
    }
}