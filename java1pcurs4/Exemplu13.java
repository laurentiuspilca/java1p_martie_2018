import java.util.*;
import java.util.stream.*;

public class Exemplu13 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("a","bb", "v", "c", "ddd");
        
        Map<Integer, List<String>> map = 
            list.stream()
                .collect(Collectors.groupingBy(s -> s.length()));
                
        System.out.println(map);        
    }
}