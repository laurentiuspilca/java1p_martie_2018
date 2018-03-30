import java.util.*;
import java.util.stream.*;

public class Exemplu9 {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("abc", "def", "xyz");
        
        String res = 
            list.stream()
                .collect(Collectors.joining(","));
        
        System.out.println(res);
    }
}