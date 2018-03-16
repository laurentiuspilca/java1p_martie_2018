import java.nio.file.*;

public class Exemplu8 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A/B/C/D");
        Path p2 = Paths.get("A", "B", "C", "D");
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.getClass());
    }
}