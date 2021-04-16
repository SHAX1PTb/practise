public class strongPasswordChecker {

    public static void main(String[] args) {
        String password = "aA123";
        char ch;
        char ch1;
        char ch2;
        char ch3;
        Integer correction = 0;
        boolean capitalflag = false;
        boolean lowercaseflag = false;
        boolean numberflag = false;
        boolean sizInsizeflag = false;
        boolean repeatingchar = false;

        if (password.length() >= 6) {
            sizInsizeflag = true;

        } else {
            correction++;
        }

        for (int i = 0; i < password.length(); i++) {
            ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                capitalflag = true;
            } else if (Character.isLowerCase(ch)) {
                lowercaseflag = true;
            } else if (Character.isDigit(ch)) {
                numberflag = true;
            }
        }

        for (int i = 0; i < password.length() - 3; i++) {
            ch1 = password.charAt(i);
            ch2 = password.charAt(i + 1);
            ch3 = password.charAt(i + 2);

            if (ch1 == ch2) {
                if (ch2 == ch3) {
                    repeatingchar = true;
                }
            }
        }

        if(repeatingchar){
            correction ++;
        }

        if( !capitalflag ){
            correction++;
        }

        if(!lowercaseflag){
            correction ++;
        }

        if(!numberflag){
            correction ++;
        }

//        if(!sizInsizeflag){
//            correction ++;
//        }


        if(password.length() <= 3){
            correction ++;
        }


        System.out.println(capitalflag);
        System.out.println(lowercaseflag);
        System.out.println(numberflag);
        System.out.println(sizInsizeflag);
        System.out.println(repeatingchar);

        System.out.println("minimum number of steps required to make password strong:"+correction);

    }

}
