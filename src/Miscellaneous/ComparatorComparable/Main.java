package Miscellaneous.ComparatorComparable;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Employee[] employees= new Employee[5];

        employees[0]= new Employee(3,"Raj");
        employees[1]= new Employee(5,"Joy");
        employees[2]= new Employee(1,"Nilesh");
        employees[3]= new Employee(2,"Raman");
        employees[4]= new Employee(4,"Saikat");

        System.out.println("Before Sorting: "+Arrays.toString(employees));

        Arrays.sort(employees);

        System.out.println("After Sorting: "+Arrays.toString(employees));

        Arrays.sort(employees,Employee.NameComparator);

        System.out.println("After Sorting via name comparator: "+Arrays.toString(employees));




    }
}
