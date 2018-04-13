import java.util.*;
import java.util.concurrent.*;

public class DisplayListAction extends RecursiveAction {
    
    private List<Integer> list;
    
    public DisplayListAction(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void compute() {
        if (list.size() <= 3) {
            list.forEach(System.out::println);
        } else {
            int mid = list.size() / 2;
            
            List<Integer> list1 = list.subList(0, mid);
            List<Integer> list2 = list.subList(mid, list.size());
            
            DisplayListAction a1 = new DisplayListAction(list1);
            DisplayListAction a2 = new DisplayListAction(list2);
            
            invokeAll(a1, a2);
        }
    }
}