import java.util.Iterator;
import java.util.LinkedList;
public class LinkedlistPrac {
    public void getlinkedlistprac(){
        LinkedList linkedList = new LinkedList();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("B");
        linkedList.add("C");
        System.out.println(linkedList);
        getIteratedItems(linkedList);

    }
    public void getIteratedItems(LinkedList linkedList){
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
