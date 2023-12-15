package DesignPatterns.FactoryDesignPattern;

public class ClientApp {

    public static void main(String[] args) {

        Employee empAndroid= EmployeeFactory.getEmployee("AndroidDev");
        if(empAndroid!=null)
            System.out.println(empAndroid.getSalary());

        Employee empWeb= EmployeeFactory.getEmployee("WebDev");
        if(empWeb!=null)
            System.out.println(empWeb.getSalary());

    }
}
