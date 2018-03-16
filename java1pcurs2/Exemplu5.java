import java.io.*;

public class Exemplu5 {
    
    public static void main(String [] args) {
        File f = new File("C:/");
        String [] files = f.list();
        
        for (String x : files) {
            System.out.println(x);
        }
    }
}