import java.io.*;

public class Exemplu11 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("c");
            ObjectInputStream in = new ObjectInputStream(fis);
        ) {
            C c1 = (C) in.readObject();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}