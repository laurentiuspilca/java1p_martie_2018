import java.io.*;

public class Exemplu12 {

    public static void main(String [] args) {
        try (
            FileOutputStream fos = new FileOutputStream("d");
            ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            D d = new D();
            out.writeObject(d);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}