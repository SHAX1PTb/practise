public class test {

    public static void main(String[] args) {
        int x = 12345;
        System.out.println((x<0?new StringBuilder(String.valueOf(-x)).reverse().append("-"):new StringBuilder(String.valueOf(x)).reverse()));
    }
}
