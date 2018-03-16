import java.nio.file.*;

public class Exemplu9 {

    public static void main(String [] args) {
        Path p1 = Paths.get("C:/A/B/C/D/E");
        Path p2 = Paths.get("A/B/C/D/E");
        
        System.out.println(p1.getRoot());
        System.out.println(p1.getParent());
        System.out.println(p1.getFileName());
        
        System.out.println(p2.getRoot());
    }
}