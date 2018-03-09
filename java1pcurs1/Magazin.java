import java.util.*;

public class Magazin implements java.io.Serializable {

    List<Produs> produse;
    
    public Magazin() {
        produse = new ArrayList<>();
    }
    
    public void adaugaProdus(Produs p) {
        produse.add(p);
    }
    
    public void afisareProduse() {
        produse.forEach(System.out::println);
    }
}