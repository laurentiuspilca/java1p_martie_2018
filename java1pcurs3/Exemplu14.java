import java.time.*;
import java.util.*;

public class Exemplu14 {

    public static void main(String [] args) {
        
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        
        zoneIds.stream()
               .sorted()
               .filter(s -> s.toLowerCase().contains("europe"))
               .forEach(System.out::println);
    }
}