import java.util.*;

public class Exemplu10 {

    public static void main(String [] args) {
        List<List<Integer>> list = new ArrayList<>();
        
        list.add(Arrays.asList(3,6,7,8));
        list.add(Arrays.asList(2,3,5,1));
        list.add(Arrays.asList(3,4,5,6));
        
        
        int sum = list.stream()
                      .flatMap(e -> e.stream())
                      .distinct()
                      .reduce(0, (a,b) -> a+b);   
                      
        System.out.println(sum);              
    }
}