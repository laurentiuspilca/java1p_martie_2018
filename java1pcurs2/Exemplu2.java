import java.io.*;

public class Exemplu2 {
    public static void main(String [] args) {
        try {
            File f = new File("A");
            f.mkdir();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}