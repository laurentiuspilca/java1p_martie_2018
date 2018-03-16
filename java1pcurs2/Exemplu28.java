import java.nio.file.*;
import java.util.*;

public class Exemplu28 {

    public static void main(String [] args) {
        Path p1 = Paths.get("./");
        try {
            Files.find(p1, 10, 
                  (p, a) -> p.toString().endsWith(".java") && 
                  a.size() < 300)
                 .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}