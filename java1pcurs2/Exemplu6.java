import java.io.*;

public class Exemplu6 {

    public static void main(String [] args) {
        File f = new File("C:/");
        File [] files = f.listFiles();
        
        for (File x : files) {
            System.out.println(x);
        }
    }
}