package Java8Features.Lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {

    public static void main(String[] args) {

        //Consumer functional interface- method accept()

        Consumer<String> consumer= (msg)-> System.out.println(msg);

        consumer.accept("message");

        //Predicate - method test()

        Predicate<Integer> pr= (number)-> number>5;

        System.out.println(pr.test(2));

        System.out.println(pr.test(7));

        //Function- method apply()

        Function<Integer,Double> fn= (a)-> Math.sqrt(a);

        System.out.println(fn.apply(16));

        //Supplier- method get()

        Supplier<Double> supplier= Math::random;

        System.out.println(supplier.get());

    }

}
