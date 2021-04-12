import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class allPairs {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7};
        int[] b = {5, 6, 3, 4, 8};
        int X=9;
        List<Integer> a1 = new ArrayList<>();
        for(int z:a){
            a1.add(z);
        }


        List<Integer> b1 = new ArrayList<>();
        for(int z:b){
            b1.add(z);
        }

        ListIterator l1 = a1.listIterator();
        ListIterator l2 = b1.listIterator();



        while (l1.hasNext()){
            int tem1 = Integer.parseInt(l1.next().toString());
            int tem2 = Integer.parseInt(l2.next().toString());
            if((tem1+tem2) == X){
                System.out.print(tem1+" "+tem2);
                System.out.println(" ");
            }
        }

        l2 = b1.listIterator();
        l1 = a1.listIterator();

        while (l2.hasNext()){
            int tem1 = Integer.parseInt(l1.next().toString());
            int tem2 = Integer.parseInt(l2.next().toString());
            if((tem1+tem2) == X){
                System.out.print(tem1+" "+tem2);
                System.out.println(" ");
            }
        }

    }
}
