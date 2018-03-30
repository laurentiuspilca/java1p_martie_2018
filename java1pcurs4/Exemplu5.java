import java.util.*;

public class Exemplu5 {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(3,6,8,2,5,9,1);
        
        int min = list.stream().min((a,b) -> a-b).orElse(0);
        int max = list.stream().max((a,b) -> a-b).orElse(0);
        
        System.out.println(min + " " + max);
    }
}