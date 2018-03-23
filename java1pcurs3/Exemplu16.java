import java.time.*;

public class Exemplu16 {

    public static void main(String [] args) {
        
        LocalDateTime ldt1 = LocalDateTime.of(2018, 3, 23, 10, 45);
        LocalDateTime ldt2 = LocalDateTime.of(2018, 3, 23, 9, 45);
        
        ZoneId zoneIdParis = ZoneId.of("Europe/Paris");
        ZoneId zoneIdBuc = ZoneId.of("Europe/Bucharest");
        
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt1, zoneIdBuc);
        ZonedDateTime zdt2 = ZonedDateTime.of(ldt2, zoneIdParis);
        
        System.out.println(zdt1.isEqual(zdt2));
    }
}