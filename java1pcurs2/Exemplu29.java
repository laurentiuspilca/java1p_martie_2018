import java.nio.file.*;
import java.util.*;

public class Exemplu29 {

    public static void main(String [] args) {
        Path p1 = Paths.get("./");
        try {
            long nr = Files.find(p1, 10, 
                  (p, a) -> p.toString().endsWith(".java") && 
                  a.size() < 300)
                 .count();
            System.out.println(nr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}