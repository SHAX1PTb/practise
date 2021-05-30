
public class Stack {

   static java.util.Stack stack = new java.util.Stack();

//   static  Stack stack = new Stack();
   static   int x = 1;


//    public Stack() {
//
//        System.out.println("x="+ x);
//    }

    void push(int i){

            stack.push(i);
        System.out.println("i am here");

    }

    public static void main(String[] args) {
        Stack t = new Stack();
        t.push(1);
    }

}
