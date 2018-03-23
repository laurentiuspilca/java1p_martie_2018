import java.time.*;

public class Exemplu13 {

    public static void main(String [] args) {
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2018, 1, 12, 10, 45);
        
        LocalTime lt1 = LocalTime.now();
        LocalDate ld1 = LocalDate.now();
        
        LocalDateTime ldt3 = LocalDateTime.of(ld1, lt1);
        
        System.out.println(ldt1);
        System.out.println(ldt2);
        System.out.println(ldt3);
    }
}