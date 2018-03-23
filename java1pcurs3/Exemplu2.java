import java.util.function.*;

public class Exemplu2 {

    public static void main(String [] args) {
        Predicate<Integer> p1 = x -> x % 2 == 0;
        
        System.out.println(p1.test(10)); // true
        
        BiPredicate<Integer, String> p2 = (i, s) -> s.length() == i;
        
        System.out.println(p2.test(5, "Hello")); // true
        
        Consumer<Integer> c1 = x -> System.out.println(x);
        Consumer<Integer> c2 = System.out::println;
        
        c1.accept(10);
        
        Supplier<Integer> s1 = () -> 4;
        
        System.out.println(s1.get());
        
        BiConsumer<Integer, String> c3 = (a,b) -> System.out.println(a + b);
        
        c3.accept(12, " mere are Ana");
        
        Function<String, Integer> f1 = s -> s.length();
        Function<Integer, Integer> f2 = i -> i*i;
        Function<String, Integer> f3 = String::length;
        
        System.out.println(f1.apply("HELLO")); // 5
        
        BiFunction<Integer, Integer, Integer> f4 = (a,b) -> a+b;
        
        System.out.println(f4.apply(10,30)); // 40
        
        UnaryOperator<Integer> u1 = i -> i*i;
        System.out.println(u1.apply(10));
        
        BinaryOperator<Integer> b1 = (a,b) -> a+b;
        System.out.println(b1.apply(10 ,10));
        
    }
 
}