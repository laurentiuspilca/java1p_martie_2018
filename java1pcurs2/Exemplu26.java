import java.nio.file.*;
import java.util.*;

public class Exemplu26 {

    public static void main(String [] args) {
        Path p1 = Paths.get("./");
        try {
            Files.list(p1)
                 .sorted(Collections.reverseOrder())
                 .filter(p -> p.toString().endsWith(".java"))
                 .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}