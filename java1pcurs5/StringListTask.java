import java.util.concurrent.*;
import java.util.*;
import java.util.stream.*;

public class StringListTask extends RecursiveTask<Integer> {


    private List<String> list;
    
    public StringListTask(List<String> list) {
        this.list = list;
    }
    
    @Override
    public Integer compute() {
        if (list.size() <= 1) {
            //return list.stream().collect(Collectors.joining()).length();
            return list.stream().mapToInt(s -> s.length()).sum(); 
        }
        
        int mid = list.size() / 2;
        
        List<String> list1 = list.subList(0, mid);
        List<String> list2 = list.subList(mid, list.size());
        
        StringListTask t1 = new StringListTask(list1);
        StringListTask t2 = new StringListTask(list2);
        
        t2.fork();
        
        return t1.compute() + t2.join();
    }
}