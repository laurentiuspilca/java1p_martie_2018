import java.io.*;

public class Exemplu3 {

    public static void main(String [] args) {
        try (PrintStream out = new PrintStream("exemplu.txt")) {
            out.print("Hello World!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}