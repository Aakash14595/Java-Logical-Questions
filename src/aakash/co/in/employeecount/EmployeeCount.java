package aakash.co.in.employeecount;

import java.util.*;
import java.util.stream.Collectors;

class EmployeeCount {
    public static void main (String as[]) {
        List<Employee> el=Arrays.asList(
                new Employee("Ram","Male","IT") ,
                new Employee("shaym","Male","AG"),
                new Employee("Seeta","Female","IT") ,
                new Employee("Geeta","Female","AG")


        );
        Map<String , Long> ecount=el.stream().collect(Collectors.groupingBy(employee -> employee.gender,Collectors.counting()));
      System.out.println(ecount);
    }
}
