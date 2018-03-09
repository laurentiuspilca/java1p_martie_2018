import java.io.*;

public class Exemplu8 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("book");
            ObjectInputStream in = new ObjectInputStream(fis)
        ) {
            Book b = (Book) in.readObject();
            System.out.println(b.title + " " + b.author);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}