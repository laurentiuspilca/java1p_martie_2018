import java.io.*;

public class Exemplu13 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("d");
            ObjectInputStream in = new ObjectInputStream(fis)
        ) {
            D d = (D) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}