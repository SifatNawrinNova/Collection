import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListsetbPrac {
    public void getListsetbPrac() {
        List list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add("B");
        list.add("C");
        System.out.println(list);
        getIteratedItems(list);
        System.out.println(list);
        getForEach(list);
    }

    public void getIteratedItems(List list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void getForEach(List list){
        for (Object o : list)
            System.out.println(o);
    }
    public ArrayList<Integer>getInteger(){
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        return integers;
    }
}
