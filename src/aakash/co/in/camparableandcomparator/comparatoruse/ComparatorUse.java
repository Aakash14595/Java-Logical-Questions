package aakash.co.in.camparableandcomparator.comparatoruse;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorUse {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 50000));
        employees.add(new Employee("Bob", 70000));
        employees.add(new Employee("Charlie", 60000));

        System.out.println("Before sorting: " + employees);

        // Sort by salary (ascending) using an anonymous class
        Comparator<Employee> salaryComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        };
        Collections.sort(employees, salaryComparator);
        System.out.println("After sorting by salary: " + employees);

        // Sort by name (alphabetical) using an anonymous class
        Comparator<Employee> nameComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
        Collections.sort(employees, nameComparator);
        System.out.println("After sorting by name: " + employees);
    }
}
