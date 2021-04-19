import java.util.ArrayList;

public class Fancy {


    static ArrayList<Integer> seq = new ArrayList();

    public Fancy() {

    }

    public static void main(String[] args) {

        new Fancy();
        append(2);
        addAll(3);
        append(7);
        multAll(2);
        getIndex(0);
        addAll(3);
        append(10);
        multAll(2);
        System.out.println(seq.toString());

    }

    static void append(int val) {


        seq.add(val);

    }

    static void addAll(int inc) {

        Integer size = seq.size();

        for (int i = 0; i < size; i++) {

            seq.set(i, seq.get(i) + 3);
        }


    }

    static void multAll(int m) {

        Integer size = seq.size();

        for (int i = 0; i < size; i++) {

            seq.set(i, seq.get(i) * 2);
        }

    }

    static int getIndex(int idx) {

        return seq.get(idx);
    }
}
