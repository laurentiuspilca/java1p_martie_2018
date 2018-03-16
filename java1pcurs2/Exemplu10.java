import java.nio.file.*;

public class Exemplu10 {

    public static void main(String [] args) {
        Path p = Paths.get("C:/A/B/C/D/E");
        
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
    }
}