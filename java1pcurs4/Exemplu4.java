import java.util.*;
import java.util.stream.*;

public class Exemplu4 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(2,4,5,6,7);
        
        int x = list.stream().findFirst().orElse(0);
        int y = list.stream().findAny().orElseThrow(RuntimeException::new);
        
        System.out.println(x + " " + y);
    }
}