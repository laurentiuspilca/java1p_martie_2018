import java.io.*;

public class Exemplu1 {

    public static void main(String [] args) {
        try {
            File f = new File("hello.txt");
            f.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}