import java.nio.file.*;
import java.util.*;

public class Exemplu22 {

    public static void main(String [] args) {
        try {
            Path p1 = Paths.get("Exemplu22.java");
            List<String> lines = Files.readAllLines(p1);
            lines.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}