import java.io.*;

public class Exemplu1 {

    public static void main(String [] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        
        try {
            System.out.print("Nume: ");
            String nume = in.readLine();
            
            System.out.print("Hello, " + nume + "!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}