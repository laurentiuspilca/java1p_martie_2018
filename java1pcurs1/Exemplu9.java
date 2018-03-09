import java.io.*;

public class Exemplu9 {

    public static void main(String [] args) {
        try (
            FileOutputStream fos = new FileOutputStream("cerc");
            ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            Cerc c = new Cerc();
            Punct p = new Punct();
            p.x = 10;
            p.y = 20;
            c.centru = p;
            
            out.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}