package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StringStartsWithSpecificCharacter {

    public static void main(String[] args) {
        List<String> listStrings= Arrays.asList("Apple","Banana","Bike","Boot","Apparent");

        Predicate<String> p1= str-> str.startsWith("A");
        Predicate<String> p2= str-> str.startsWith("B");
//Filter using predicates
        List<String > list1= listStrings
                .stream()
                .filter(p1)
                .toList();

        List<String > list2= listStrings
                .stream()
                .filter(p2)
                .toList();

        System.out.println(list1);
        System.out.println(list2);
    }
}
