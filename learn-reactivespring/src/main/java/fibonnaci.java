public class fibonnaci {

    public static void main(String[] args) {
        int n = 9;
        System.out.println(fin(n));
    }

    private static int fin(int n) {
        //
        int[] f = new int[n + 2];
        f[1] = 1;
        f[0] = 0;
        for (int i = 2; i < n + 2; i++) {

            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
