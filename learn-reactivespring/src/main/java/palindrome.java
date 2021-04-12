public class palindrome {

    public static void main(String[] args) {

        String a = "gadag";

        StringBuilder b = new StringBuilder();
b.append(a);

b.reverse();

        if(a.equalsIgnoreCase(String.valueOf(b))){

            System.out.println("palindrome");
        }
    }


}
