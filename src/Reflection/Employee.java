package Reflection;

import java.io.Serializable;

public class Employee {

    private int id;
    private String name;


    public void setId(int id) {
        this.id = id;
    }


    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void test(String name) {
        System.out.println("My name is "+name);
    }


}
