import java.io.*;

public class Program {
    
    private static Magazin m = new Magazin();

    public static void main(String [] args) {
        try (
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader cons = new BufferedReader(isr)
        ) {
           String cmd;
           while (true) {
               System.out.print("Comanda: ");
               cmd = cons.readLine();
               
               String [] v = cmd.split("\\s+");
               
               switch (v[0]) {
                   case "exit": 
                        System.out.println("Se inchide...");
                        return;
                   case "ap" : {
                       String nume = v[1];
                       double pret = Double.parseDouble(v[2]);
                       Produs p = new Produs(nume, pret);
                       m.adaugaProdus(p);
                       System.out.println("A fost adaugat un produs!");
                   } break;
                   
                   case "afisare" : {
                       m.afisareProduse();
                   } break;
                   
                   case "save" : {
                       try (
                            FileOutputStream fos = new FileOutputStream(v[1]);
                            ObjectOutputStream out = new ObjectOutputStream(fos);
                       ) {
                           out.writeObject(m);
                           System.out.println("Salvare reusita!");
                       }
                   } break;
                   
                   case "open" : {
                       try (
                        FileInputStream fis = new FileInputStream(v[1]);
                        ObjectInputStream in = new ObjectInputStream(fis);
                       ) {
                           m = (Magazin) in.readObject();
                           System.out.println("Deschidere reusita!");
                       }
                   } break;
               }
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}