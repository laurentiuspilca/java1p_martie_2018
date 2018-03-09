import java.io.*;

public class Book implements Serializable {

    String title;
    transient String author;
    
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}