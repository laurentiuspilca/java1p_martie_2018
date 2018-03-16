import java.io.*;

public class Exemplu4 {

    public static void main(String [] args) {
        try {
            File f = new File("A");
            f.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}