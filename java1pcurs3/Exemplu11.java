import java.time.*;

public class Exemplu11 {

    public static void main(String [] args) {
        LocalTime now = LocalTime.now();
        LocalTime lt1 = LocalTime.of(10, 45);
        LocalTime lt2 = LocalTime.of(10, 45, 30);
        LocalTime lt3 = LocalTime.of(10, 45, 30, 12345678);
        
        System.out.println(now);
        System.out.println(lt1);
        System.out.println(lt2);
        System.out.println(lt3);
        
        LocalTime lt4 = lt1.plusSeconds(10);
        System.out.println(lt4);
        
        LocalTime lt5 = lt1.minusMinutes(10);
        System.out.println(lt5);
        
        LocalTime lt6 = lt1.plusHours(25);
        System.out.println(lt6);
        
        boolean r1 = lt1.isAfter(lt2);
        boolean r2 = lt1.isBefore(lt2);
    }
}