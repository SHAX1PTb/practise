public class isNumber {

    public static void main(String[] args) {
        String s = "123+";
        System.out.println(isNumber(s));
    }

    public static boolean isNumber(String s) {

        boolean seenDigit = false;
        boolean seenExponent = false;
        boolean seenDot = false;


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                seenDigit = true;
            }else if(ch == 'e' || ch == 'E'){
                if(seenExponent || !seenDigit){
                    return  false;
                }
                seenExponent = true;
                seenDigit = false;
            } else if(ch == '+' || ch == '_'){
                if(i>0 || s.charAt(i-1) != 'e' || s.charAt(i-1) != 'E'){
                    return  false;
                }
            } else if( ch == '.'){
                if(seenDot || seenExponent){
                    return  false;
                }
                seenDot = true;
            } else {
                return false;
            }


        }


        return seenDigit;
    }
}
