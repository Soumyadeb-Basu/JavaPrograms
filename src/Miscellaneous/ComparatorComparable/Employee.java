package Miscellaneous.ComparatorComparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{

    private int id;

    private String name;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Employee(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id-o.id;
    }

    public static Comparator<Employee> NameComparator= (e1,e2)-> e1.getName().compareTo(e2.getName());
}
