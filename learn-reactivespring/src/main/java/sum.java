import java.util.Arrays;

public class sum {

    public static void main(String[] args) {
        int[] a = { 8, 7, 2, 5, 3, 1};
        int sum = 10;
        findpair(a, sum);

    }

    static void findpair(int[] a , int sum){

        Arrays.sort(a);
        int low =0;
        int high = a.length-1;
        while(low<high){
            if(a[low]+a[high] == sum){
                System.out.println("("+a[low]+","+a[high]+")");
            }

            if(a[low]+a[high] < sum){
                low++;
            }else
                high--;

        }
        System.out.println("pair not found");
    }

}
