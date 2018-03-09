import java.io.*;

public class Exemplu10 {

    public static void main(String [] args) {
        C c1 = new C();
        
        try (
            FileOutputStream fos = new FileOutputStream("c");
            ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            out.writeObject(c1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}