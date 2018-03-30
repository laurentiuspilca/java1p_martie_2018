import java.util.*;
import java.util.stream.*;

public class Exemplu14 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("a","bb", "v", "c", "ddd");
        
        Map<Integer, String> map = 
            list.stream()
                .collect(Collectors.groupingBy(s -> s.length(), 
                    Collectors.joining(",")));
                
        System.out.println(map);        
    }
}