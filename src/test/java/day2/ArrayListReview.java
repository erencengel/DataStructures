package day2;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Mary"));

        //for loop
        System.out.println("Printing with legacy for-loop.........");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        //iterator
        //forward iteration
        System.out.println("");
        System.out.println("Printing with iterator.........");
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //iterator
        //backward iteration
        System.out.println("");
        System.out.println("Printing backward with iterator.........");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //for each
        System.out.println("");
        System.out.println("Printing with foreach loop.........");
        for (Student student : students) {
            System.out.println(student);
        }

        //lambda
        System.out.println("");
        System.out.println("Printing with lambda.........");
        students.forEach(n -> System.out.println(n.getId() + "-" + n.getName()));

        //sorting elements in list using comparator interface
        System.out.println("");
        System.out.println("Sorting with comparator interface by Id descending.........");
        Collections.sort(students, new sortByIdDesc());
        students.forEach(n -> System.out.println(n.getId() + "-" + n.getName()));

        //sorting elements in list using comparator interface
        System.out.println("");
        System.out.println("Sorting with comparator interface by Name descending.........");
        Collections.sort(students, new sortByNameDesc());
        students.forEach(n -> System.out.println(n.getId() + "-" + n.getName()));


    }

    static class sortByIdDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id-o1.id;
        }

    }

    static class sortByNameDesc implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.getName().compareToIgnoreCase(o1.getName());
        }

    }


}
