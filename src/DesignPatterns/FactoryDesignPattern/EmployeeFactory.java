package DesignPatterns.FactoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String empType) {
        if(empType.equalsIgnoreCase("AndroidDev"))
            return new AndroidDeveloper();
        else if(empType.equalsIgnoreCase("WebDev"))
            return new WebDeveloper();
        else
            return null;
    }

}
