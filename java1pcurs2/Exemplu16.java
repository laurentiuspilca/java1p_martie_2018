import java.io.*;
import java.nio.file.*;

public class Exemplu16 {

    public static void main(String [] args) {
        File f = new File("A/B/C/D");
        Path p1 = f.toPath();
        File f2 = p1.toFile();
        
        
    }
}