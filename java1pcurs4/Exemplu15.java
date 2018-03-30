import java.util.*;
import java.util.stream.*;

public class Exemplu15 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("a","bb", "v", "c", "ddd");
        
        Map<Integer, Long> map = 
            list.stream()
                .collect(Collectors.groupingBy(s -> s.length(), 
                    Collectors.counting()));
                
        System.out.println(map);        
    }
}