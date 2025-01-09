package aakash.co.in.camparableandcomparator.camparableuse;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableUse {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        System.out.println("Before sorting: " + students);
        Collections.sort(students); // Uses compareTo()
        System.out.println("After sorting by age: " + students);
    }
}