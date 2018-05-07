import java.util.List;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setPrac {
    public void getsetPrac(){
        Set set = new TreeSet();
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("C");
        System.out.println(set);
        getIteratedItems(set);
        System.out.println(set);
        getForEach(set);
    }
    public void getIteratedItems( Set set){
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public void getForEach(Set set){
        for (Object o : set)
            System.out.println(o);
    }

}
