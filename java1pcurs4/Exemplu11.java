import java.util.*;
import java.util.stream.*;

public class Exemplu11 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        
        long nr = 
            list.stream()
                .collect(Collectors.counting());
                
        System.out.println(nr);        
    }
}