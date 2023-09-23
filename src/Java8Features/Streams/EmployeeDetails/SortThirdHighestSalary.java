package Java8Features.Streams.EmployeeDetails;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortThirdHighestSalary {

    public static void main(String[] args) {

        Employee e1= new Employee(1,"A","HR",12000.0);
        Employee e2= new Employee(2,"B","Manager",15000.0);
        Employee e3= new Employee(3,"C","SDE",20000.0);
        Employee e4= new Employee(4,"D","HR",16000.0);
        Employee e5= new Employee(5,"E","HR",23000.0);

        List<Employee> employeeList= Arrays.asList(e1,e2,e3,e4,e5);

        List<Double> salaries= employeeList
                .stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(3)
                .map(Employee::getSalary)
                .collect(Collectors.toList());

        System.out.println(salaries);

    }

}
