package Java8Features.Streams.EmployeeDetails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SalaryCalculations {
    public static void main(String[] args) {

        Employee e1= new Employee(1,"A","HR",12000.0);
        Employee e2= new Employee(2,"B","Manager",15000.0);
        Employee e3= new Employee(3,"C","SDE",20000.0);
        Employee e4= new Employee(4,"D","HR",16000.0);

        List<Employee> employeeList= new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);

        //Minimum salaried employee
        List<Employee> employeeMinSalary= employeeList.stream().sorted((emp1,emp2)-> (int) (emp1.getSalary()-emp2.getSalary())).limit(1).toList();
        System.out.println(employeeMinSalary);

        //Minimum salaried employee
        List<Employee> employeeMaxSalary= employeeList.stream().sorted((emp1,emp2)-> (int) (emp2.getSalary()-emp1.getSalary())).limit(1).toList();
        System.out.println(employeeMaxSalary);


    }
}
