package Miscellaneous.EqualsHashcode;

public class Main {

    public static void main(String[] args) {

        Student s1= new Student(1,"Amit");
        Student s2= new Student(2,"Raj");
        Student s3= new Student(1,"Amit");
        Student s4= s2;

        System.out.println("Hashcode of s1 and s3 are equal- "+(s1.hashCode()==s3.hashCode()));
        System.out.println("Hashcode of s2 and s4 are equal- "+(s2.hashCode()==s4.hashCode()));

        System.out.println("Equals method for s1 and s3- "+s1.equals(s3));
        System.out.println("Equals method for s2 and s4- "+s2.equals(s4));



    }
}
