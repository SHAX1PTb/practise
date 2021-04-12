public class maxLength {

    public static void main(String[] args) {
        String s = "((((()))";

        Integer length = s.length();

        Integer open = 0, close = 0;
        for (int i = 0; i < length; i++) {

            if (s.charAt(i) == '(') {
                open++;

            } else {
                close++;
            }

        }

//        System.out.println("open"+open);
//        System.out.println("close"+close);

if(open > close){

    System.out.println(close*2);
}else{
    System.out.println(open*2);
}

    }
}
