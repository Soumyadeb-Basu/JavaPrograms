package Java8Features.Lambda;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class LambdaExamples1 {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> sum= (a, b)-> a+b;

        System.out.println(sum.apply(2,3));

        List<Integer> numbers= Arrays.asList(1,2,3,4);
        System.out.println("-------------");
//Filter Even Odd numbers
       numbers
               .stream().
               filter(n->n%2==0)
               .forEach(System.out::println);
        System.out.println("-------------");
        numbers
                .stream().
                filter(n->n%2!=0)
                .forEach(System.out::println);
        System.out.println("-------------");
//Filter distinct numbers
        numbers.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("-------------");
        // Sum and Product of all numbers
        Integer sumOfNumbers= numbers
                .stream()
                .reduce(0,(a,b)->a+b);
        System.out.println("Sum: "+sumOfNumbers);
        Integer productOfNumbers= numbers
                .stream()
                .reduce(1,(a,b)->a*b);
        System.out.println("Product: "+productOfNumbers);
        System.out.println("-------------");
        //Distinct minimum and maximum values
        int maximum= numbers
                .stream()
                .distinct()
                .max(Integer::compareTo)
                .get();
        int minimum=numbers.stream()
                .distinct()
                .min(Integer::compareTo)
                .get();
        System.out.println("Maximum: "+maximum);
        System.out.println("Minimum: "+minimum);
        System.out.println("-------------");

        //Finding second-largest and second-smallest number in list
        System.out.println("Second smallest number->");
        System.out.println(numbers
                .stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get());
        System.out.println("Second largest number->");
        System.out.println(numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get());

    }

}
