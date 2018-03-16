import java.nio.file.*;

public class Exemplu20 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("A/B/C/D");
            Path p2 = Paths.get("A/B/C/D");
            
            boolean res = Files.isSameFile(p1,p2);
            
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}