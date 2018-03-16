import java.io.*;

public class Exemplu3 {

    public static void main(String [] args) {
        try {
            File f = new File("B/C/D/E");
            f.mkdirs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}