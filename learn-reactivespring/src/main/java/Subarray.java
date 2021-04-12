import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Subarray {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N = 10;
        int S = 15;


        List<Integer> ret = subarraySum(a, N, S);
//        for (Integer abc:ret ) {
//            System.out.println("Return:"+abc);
//
//        }

        System.out.println(ret.stream().reduce((first,second) -> first));
        System.out.println(ret.stream().reduce((first,second) -> second));

    }

    static List<Integer> subarraySum(int[] a, int n, int s) {

        List<Integer> ret = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for (int d : a) {
            c.add(d);
        }
        Integer total = 0;

        ListIterator li = c.listIterator();
        while (total < s) {
//        while (li.hasNext()) {

            int temp = (int) li.next();
            ret.add(temp);

            total = total + temp;
//            System.out.println(total);


        }

        return ret;
    }
}
