import java.nio.file.*;

public class Exemplu23 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("Exemplu23.java");
            byte [] res = Files.readAllBytes(p1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}