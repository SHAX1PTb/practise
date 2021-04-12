public class strstr {

    public static void main(String[] args) {
        String s = "GeeksForGeeks" , x = "For";
        if(!s.contains(x)){

            System.out.println("-1");
        }else{
            System.out.println(s.indexOf(x));
        }
    }
}
