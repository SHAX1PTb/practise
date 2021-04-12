import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class CountWays {

    public static void main(String[] args) {
        //A=1,B=2 .... Z= 36

        String message = "12345";
        char[] cArray = message.toCharArray();
//
//        System.out.print(cArray[1]);
//        System.out.print(cArray.length);

        int i =1;
        for(char ss:cArray){
            System.out.println(i++);

        }

        for(int j =0;j<cArray.length;j++){
           int temp1= cArray[j];
           int temp2= cArray[j+1];

        }


        byte[] byteMessage = "12345".getBytes(StandardCharsets.UTF_8);



        List<String> listmessage = new ArrayList<>();
        for (byte ss : byteMessage) {

//            System.out.println(new String(ss).split().);

        }
//for(int i =0;i<byteMessage.length;i++){
//
//    String aa = message.substring(i,1);
//
//    if(Integer.parseInt(aa) < 36){
//        System.out.println("one possibility");
//    }
}

//        System.out.println(listmessage);


//    }


}
