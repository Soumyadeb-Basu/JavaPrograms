package Java8Features.Streams.EmployeeDetails;

import java.util.Arrays;
import java.util.List;

public class Stream_Operations {

    public static void main(String[] args) {

        Employee e1= new Employee(1,"Ramesh", "Manager");
        Employee e2= new Employee(2,"Jatin", "HR");
        Employee e3= new Employee(3,"Ankit", "RMG");
        Employee e4= new Employee(4,"Sujoy", "CEO");

        List<Employee> list= Arrays.asList(e1,e2,e3,e4);

        System.out.println("-----------------");
        list.stream().filter(e-> e.getId()%2==0).map(Employee::getDesignation).forEach(System.out::println);

        System.out.println("-----------------");

        //peek method-> can be used in debugging as it can print the intermediate values
        list.stream().filter(e->e.getName().startsWith("R"))
                .peek(System.out::println)
                .map(Employee::getDesignation)
                .peek(System.out::println)
                .forEach(e->System.out.println(e.toUpperCase()));

        System.out.println("-----------------");

        //limit method-> limit to n number of values; short circuit operation
        list.stream()
                .limit(2)
                .forEach(System.out::println);

    }
}
