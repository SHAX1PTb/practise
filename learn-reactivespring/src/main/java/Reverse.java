import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverse {

    public static void main(String[] args) {

        String a = "This is the god";

//        StringBuilder input1 = new StringBuilder();
//
//        input1.append(a);
//
//        System.out.println(input1.reverse());


        char[] hello = a.toCharArray();

        List<Character> trail1 = new ArrayList<>();

        for(char c:hello){
            trail1.add(c);
        }

        Collections.reverse(trail1);

        ListIterator li = trail1.listIterator();

        while(li.hasNext()){
            System.out.print(li.next());
        }

    }
}
