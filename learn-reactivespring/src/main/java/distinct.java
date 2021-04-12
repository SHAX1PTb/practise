import java.util.*;

public class distinct {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 2, 1, 4};

        List<Integer> zz = new ArrayList<>();

        System.out.println(Arrays.stream(a));

        HashSet bb = new HashSet();
        for (int cc : a) {
            bb.add(cc);
            zz.add(cc);
        }

        System.out.println(bb.size());
        Collections.sort(zz);

        System.out.println(zz.toString());

        HashMap aaa = new HashMap();
        aaa.put(11, "value1");
        aaa.put(12, "value2");
        aaa.put(13, "value3");
        aaa.put(14, "value4");
        aaa.put(15, "value5");

        Set bbb = aaa.entrySet();

        Iterator ttt = bbb.iterator();

        while(ttt.hasNext()){

            Map.Entry me =(Map.Entry) ttt.next();
            System.out.println(me.getKey() +":" +me.getValue());
        }

    }
}
