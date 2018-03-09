import java.io.*;

public class Exemplu2 {

    public static void main(String [] args) {
        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr)
        ) {
            System.out.print("X: ");
            int x = Integer.parseInt(in.readLine());
            System.out.print("Y: ");
            int y = Integer.parseInt(in.readLine());
            
            System.out.println("SUMA: " + (x + y));
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
}