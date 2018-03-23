import java.time.*;

public class Exemplu17 {

    public static void main(String [] args) {
        Duration d1 = Duration.ofMinutes(10);
        Duration d2 = Duration.ofDays(10);
        
        
        System.out.println(d1);
        System.out.println(d2);
        
        Period p1 = Period.ofDays(10);
        Period p2 = Period.ofYears(10);
        
        System.out.println(p1);
        System.out.println(p2);
    }
}