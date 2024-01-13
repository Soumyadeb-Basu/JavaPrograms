package Serialization;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Employee emp= new Employee();
        emp.setId(23);
        emp.setName("Raja");
//Serialization
        FileOutputStream flStream= new FileOutputStream("C:\\Users\\Soumyadeb Basu\\Documents\\Serialization\\newFile.ser");
        ObjectOutputStream obStream= new ObjectOutputStream(flStream);
        obStream.writeObject(emp);
//Deserialization
        FileInputStream flinput= new FileInputStream("C:\\Users\\Soumyadeb Basu\\Documents\\Serialization\\newFile.ser");
        ObjectInputStream obinput= new ObjectInputStream(flinput);
        Employee newEmp= (Employee)obinput.readObject();
        System.out.println(newEmp);

        obStream.close();
        flStream.close();


    }
}
