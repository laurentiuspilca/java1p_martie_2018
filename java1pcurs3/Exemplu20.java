import java.util.*;

public class Exemplu20 {

    public static void main(String [] args) {
        Locale loc = new Locale("fr");
        
        ResourceBundle bundle = ResourceBundle.getBundle("ResExemplu", loc);
        
        String hello = bundle.getString("txtHello");
        
        System.out.println(hello);
    }
}