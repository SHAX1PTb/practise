import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {

    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<Student>();

        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));


        ArrayList<Student1> al1 = new ArrayList<Student1>();

        al1.add(new Student1(101,"Vijay",23));
        al1.add(new Student1(106,"Ajay",27));
        al1.add(new Student1(105,"Jai",21));



        Collections.sort(al);

        for(Student sl : al){
            System.out.println(sl.rollno + " " + sl.name + " "+ sl.age);
        }
        System.out.println("*****************");
        Collections.sort(al1,new NameComparator());
        Iterator ltr = al1.iterator();
        while (ltr.hasNext()){
            Student1 st = (Student1) ltr.next();
            System.out.println(st.rollno+ ""+st.name+ ""+ st.age);
        }

        System.out.println("*****************");

        Collections.sort(al1,new AgeComparator());
        Iterator ltr2 = al1.iterator();
        while (ltr2.hasNext()){
            Student1 st = (Student1) ltr2.next();
            System.out.println(st.rollno+ ""+st.name+ ""+ st.age);
        }

    }
}
