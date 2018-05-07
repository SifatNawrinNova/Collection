import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

    ListsetbPrac listsetbPrac = new ListsetbPrac();
    listsetbPrac.getListsetbPrac();
        LinkedlistPrac linkedlistPrac = new LinkedlistPrac();
        linkedlistPrac.getlinkedlistprac();
        setPrac setPrac = new setPrac();
        setPrac.getsetPrac();
        ArrayList<Integer> integerArrayList = listsetbPrac.getInteger();
        for(Integer integer : integerArrayList)
            System.out.println(integer);

    }
}
