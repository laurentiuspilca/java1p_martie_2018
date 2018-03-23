public class Exemplu1 {

    public static void main(String [] args) {
        
        Predicat p1 = new Predicat() {
            public boolean test(int x) {
                return x % 2 == 0;
            }
        };
        
        System.out.println(p1.test(10));
        
        Predicat p2 = x -> x % 2 == 0;
        
        System.out.println(p2.test(10));
    }
}