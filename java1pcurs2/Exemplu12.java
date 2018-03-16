import java.nio.file.*;

public class Exemplu12 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A/B/.././././C/D");
        Path p2 = Paths.get("C/D/E/F");
        /**
         * A A
         * A R
         * R A
         * R R
         */
       
        
        Path p3 = p1.resolve(p2); // A/B/C/D/C/D/E/F
        
        System.out.println(p3);
    }
}