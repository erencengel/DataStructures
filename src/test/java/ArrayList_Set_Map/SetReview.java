package ArrayList_Set_Map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetReview {

    public static void main(String[] args) {

        Set<Student> set  = new HashSet<>();

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));

        //print all
        //no insertion order with hash set
        //no duplication
        System.out.println("print all");
        System.out.println("set = " + set);

        //insertion order with linked set
        //no duplication
        set = new LinkedHashSet<>();
        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Mary"));
        set.add(new Student(4, "Mary"));
        System.out.println(set.add(new Student(4, "Mary"))); //will return false
        System.out.println("");
        System.out.println("print all");
        System.out.println("set = " + set);


    }

}
