import java.util.*;

public class Exemplu9 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(2,2,2,5,4,5,3,7,7,8,3,2);
        
        list.stream().distinct().forEach(System.out::println);
    }
}