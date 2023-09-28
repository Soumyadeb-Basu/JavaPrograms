package Java8Features.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxAndMinNumbersInStream {

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9);

        int maxNumber= list1.stream()
                .max(Integer::compareTo)
                .get();

        int minNumber= list1.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println(maxNumber+" and "+minNumber);
        System.out.println("--------");
        //Three max and three min numbers

        Stream<Integer> minStream= list1.stream().sorted().limit(3);
        minStream.forEach(System.out::println);
        System.out.println("--------");
        Stream<Integer> maxStream= list1.stream().sorted(Comparator.reverseOrder()).limit(3);
        maxStream.forEach(System.out::println);


    }
}
