import java.nio.file.*;

public class Exemplu17 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("Exemplu17.java");
            Path p2 = Paths.get("copie.txt");
            Files.copy(p1,p2); // Files.move(p1,p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}