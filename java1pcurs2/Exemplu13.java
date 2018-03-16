import java.nio.file.*;

public class Exemplu13 {

    public static void main(String [] args) {
        Path p1 = Paths.get("A/B/C/D");
        Path p2 = Paths.get("C:/E/W");
        
        Path p3 = p1.resolve(p2);
        
        System.out.println(p3);
    }
}