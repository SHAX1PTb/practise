import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class rrrr {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        LinkedList aa = new LinkedList();
        aa.addAll(a);

        Integer n = 4;
        Integer b = 0;
        Integer rem = aa.size()%n;
        System.out.println(rem);
        for (int j = 0; j < (aa.size() / 4); j++) {
            n = n + j * 4;
            b = n-4;
            for (int i = n - 1; i >= b; i--) {
                System.out.print(aa.get(i));
            }
            System.out.println("");
        }
//
//        Iterator ll = aa.descendingIterator();
//
//        while(ll.hasNext()){
//            System.out.println(ll.next());
//        }


    }
}
