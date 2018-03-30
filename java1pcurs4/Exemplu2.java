import java.util.*;

public class Exemplu2 {

    public static void main(String [] args) {
        Optional<String> str = getSomeString(); 
 
        str.ifPresent(System.out::println);
    }
    
    private static Optional<String> getSomeString() {
        try {
            return Optional.of("HELLO");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return Optional.empty();
    }
}