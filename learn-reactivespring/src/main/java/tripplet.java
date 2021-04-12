import java.util.Arrays;

public class tripplet {

    public static void main(String[] args) {
        int[] arr = { 2, 7, 4, 0, 9, 5, 1, 3 };
        int sum = 6;

        printAllTriplets(arr, sum);
    }

    private static void printAllTriplets(int[] arr, int sum) {

        Arrays.sort(arr);
        for(int i =0;i<arr.length-3;i++){

            int k = sum - arr[i];

            int low = i+1;
            int high = arr.length -1;

            while(low<high){
                if(arr[low]+arr[high] < k){
                    low++;
                }else  if(arr[low]+arr[high] > k){
                    high--;
                }else {
                    System.out.println("("+arr[i]+","+arr[low]+","+arr[high]+")");
                    low++;
                    high--;
                }
            }
        }
    }
}
