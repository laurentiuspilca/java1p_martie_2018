import java.io.*;

public class Exemplu7 {

    public static void main(String [] args) {
        try (
            FileOutputStream fos = new FileOutputStream("book");
            ObjectOutputStream out = new ObjectOutputStream(fos)
        ) {
            Book b = new Book("Titlu", "Autor");
            out.writeObject(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}