package Java8Features.Lambda;

import java.util.function.Predicate;

public class Method_reference_exmp {

    public static boolean test(int n) {

        return n % 5 == 0;

    }

    public static void main(String[] args) {

        //Using method reference
        Predicate<Integer> p1= Method_reference_exmp::test;
        System.out.println(p1.test(4));
        System.out.println(p1.test(10));

        //using Lambda expression
        Predicate<Integer> p2= (n)->n%5==0;
        System.out.println(p2.test(20));
        System.out.println(p2.test(9));

    }

}
