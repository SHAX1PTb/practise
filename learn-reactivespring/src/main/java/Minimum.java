public class Minimum {

    public static void main(String[] args) {

        int[] a = {1000, 11, 445, 1, 330, 3000};

        int arraysize = 6;

        pair minmax = getMinMax(a, arraysize);

        System.out.println(minmax.max);
        System.out.println(minmax.min);

    }

    static pair getMinMax(int[] arr, int n) {

        pair minmax = new pair();
        int i;

        if (n % 2 == 0) {

            if(arr[0] > arr[1]){
                minmax.max = arr[0];
                minmax.min = arr[1];
            }else {
                minmax.max = arr[1];
                minmax.min = arr[0];
            }

            i=2;


        }else {
            minmax.min=arr[0];
            minmax.max=arr[0];
        }

        return minmax;
    }

    static class pair {
        int min;
        int max;
    }
}
