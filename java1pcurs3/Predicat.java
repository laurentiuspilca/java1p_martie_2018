@FunctionalInterface
public interface Predicat {

    public boolean test(int x);
    
    default void m() {
    }
}