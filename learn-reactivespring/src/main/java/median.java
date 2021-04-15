import java.util.Arrays;

public class median {

    public static void main(String[] args) {

        int[] num1 = {1, 3};
        int[] num2 = {2,4};
        int[] num3 = new int[num1.length + num2.length];

        System.arraycopy(num1, 0, num3, 0, num1.length);
        System.arraycopy(num2, 0, num3, num1.length, num2.length);
        Arrays.sort(num3);
        if (num3.length % 2 == 0) {

            System.out.println("Array is even");
            int temp = (int) Math.ceil((double) num3.length / 2);

            double temp3 = (double) (num3[temp] + num3[temp-1]) / 2;
            System.out.println("median is " + temp3);
        } else {
            System.out.println("Array is ODD");

            int temp = (int) Math.ceil((double) num3.length / 2);
            System.out.println("median is " + temp);
        }


    }

}
