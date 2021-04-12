public class addTwoNumbers {

    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};


        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        a.append(l1[0]);
        a.append(l1[1]);
        a.append(l1[2]);
        a.reverse();
//        System.out.println(a);

        b.append(l2[0]);
        b.append(l2[1]);
        b.append(l2[2]);
        b.reverse();

        System.out.println(Integer.valueOf(String.valueOf(a)) + Integer.valueOf(String.valueOf(b)));
    }
}
