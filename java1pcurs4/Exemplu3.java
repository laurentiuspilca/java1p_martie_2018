import java.util.*;

public class Exemplu3 {
    
    public static void main(String [] args) {
        Optional<String> o1 = Optional.empty();
        
        String s1 = "";
        Optional<String> o2 = Optional.of(s1);
        
        String s2 = null;
        Optional<String> o3 = Optional.ofNullable(s2);
        
        if (o2.isPresent()) {
            System.out.println(":)");
        }
        
        //String hello = null;
        //if (o2.isPresent()) {
        //    hello = o2.get();
        //}
        
        // hello ????
        
        String hello = o2.orElse("World!");
        hello = o2.orElseThrow(RuntimeException::new);
        
        
        int k = o1.map(s -> s.length()).orElse(0);
    }
}