public class Produs implements java.io.Serializable {

    String nume;
    double pret;
    
    public Produs(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString() {
        return nume + " " + pret;
    }
}