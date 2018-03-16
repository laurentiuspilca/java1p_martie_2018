import java.nio.file.*;

public class Exemplu15 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C/D/E/F");
        
        Path p2 = p1.subpath(1,5);
        
        System.out.println(p2);
    }
}