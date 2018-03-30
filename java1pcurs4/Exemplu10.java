import java.util.*;
import java.util.stream.*;

public class Exemplu10 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("a", "abc", "tr", "1234");
        
        double res1 = 
            list.stream()
                .collect(Collectors.averagingInt(s -> s.length()));
                
        double res2 = 
            list.stream()
                .map(s -> s.length())
                .collect(Collectors.averagingInt(x -> x));  
         
        System.out.println(res1 + " " + res2);        
    }
}