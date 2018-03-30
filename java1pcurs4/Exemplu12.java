import java.util.*;
import java.util.stream.*;

public class Exemplu12 {

    public static void main(String [] args) {
        Produs p1 = new Produs("produs 1", 12);
        Produs p2 = new Produs("produs 2", 65);
        Produs p3 = new Produs("produs 3", 45);
        
        List<Produs> list = Arrays.asList(p1,p2,p3);
        
        Map<String, Double> map = 
            list.stream()
                .collect(Collectors.toMap(p -> p.nume, p -> p.pret));
                
        System.out.println(map);        
    }
}