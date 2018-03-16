import java.nio.file.*;

public class Exemplu11 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/.././B/C/D/../.././././E/././../R/T");
        /**
              B/R/T
         */
        
        Path p2 = p1.normalize();
        
        System.out.println(p2);
    }
}