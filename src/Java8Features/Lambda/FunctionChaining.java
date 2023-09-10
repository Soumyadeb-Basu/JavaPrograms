package Java8Features.Lambda;

import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args) {
        Function<String,String> f1= String::toUpperCase;

        Function<String,String> f2= (s)-> s.concat("_new");

        System.out.println(f1.andThen(f2).apply("message"));

        System.out.println(f1.compose(f2).apply("message"));
    }

}
