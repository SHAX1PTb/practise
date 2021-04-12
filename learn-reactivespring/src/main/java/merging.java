import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class merging {

    public static void main(String[] args) {
        int[] x = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] y = { 1, 8, 9, 10, 15 };

        ArrayList<Integer> aa = new ArrayList();
        Arrays.sort(x);
        for(int i =0;i<x.length;i++){
            if(x[i] != 0){
                aa.add(x[i]);
            }
        }
        for(int j =0;j<y.length;j++){
            if(y[j] != 0){
                aa.add(y[j]);
            }
        }
        Collections.sort(aa);
        for(int bb:aa){

            System.out.println(bb);
        }

    }
}
