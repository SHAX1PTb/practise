import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class maxIndexDiff {
    public static void main(String[] args) {

        int[] a = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        Integer size = a.length;
        List<Integer> aa = new ArrayList<>();

        for(int bb:a){
            aa.add(bb);
        }

        ListIterator zz = aa.listIterator();

        for(int i =0; i<size; i ++){
            while(zz.hasNext()){
                Integer temp = (Integer) zz.next();
                if(a[i] < Integer.valueOf(String.valueOf(temp))){
                    System.out.print(a[i]);
                    System.out.print(":");
                    System.out.print(temp);
                    System.out.println(",");

                }

            }

            zz = aa.listIterator();
        }


     }

}
