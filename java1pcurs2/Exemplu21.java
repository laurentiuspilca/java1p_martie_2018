import java.nio.file.*;
import java.io.*;

public class Exemplu21 {

    public static void main(String [] args) {
        Path p1 = Paths.get("Exemplu21.java");
        try (BufferedReader in = Files.newBufferedReader(p1)) {
            String line;
            while ( (line = in.readLine() ) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}