import java.time.*;

public class Exemplu15 {

    public static void main(String [] args) {
        ZoneId zoneIdParis = ZoneId.of("Europe/Paris"); 
        ZoneId zoneIdBucharest = ZoneId.of("Europe/Bucharest"); 
        
        ZonedDateTime zdt1 = ZonedDateTime.now(zoneIdParis);
        ZonedDateTime zdt2 = ZonedDateTime.now(zoneIdBucharest);
        ZonedDateTime zdt3 = ZonedDateTime.now();
        
        System.out.println(zdt1);
        System.out.println(zdt2);
        System.out.println(zdt3);
    }
}