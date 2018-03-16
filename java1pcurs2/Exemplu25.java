import java.nio.file.*;

public class Exemplu25 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu25.java");
        try {
            Files.lines(p1)
                .filter(s -> s.length() % 2 == 0)
                .map(s -> new StringBuilder(s).reverse())
                .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}