import java.io.*;

public class Exemplu6 {

    public static void main(String [] args) {
        try (
            FileInputStream fis = new FileInputStream("numere.txt");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader in = new BufferedReader(isr)
        ) {
            String line;
            int suma = 0;
            
            while ((line = in.readLine()) != null) {
                int nr = Integer.parseInt(line);
                suma += nr;
            }
            
            System.out.println("SUMA: " + suma);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}