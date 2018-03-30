import java.util.stream.*;
public class Exemplu17 {

    public static void main(String [] args) {
        Thread t = new Thread(Exemplu17::afisareNumere);
        t.start();
        System.out.println("The end!");
    }
    
    private static void afisareNumere() {
        Stream.iterate(1, i -> i + 1).limit(10).forEach(System.out::println);
    }
}