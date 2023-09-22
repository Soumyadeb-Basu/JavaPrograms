package Java8Features.Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,2,3,4,5,5,6,6,7);
        Set<Integer> set= new HashSet<>();
        list.stream()
                .filter(x->!set.add(x)) //set.add() returns false if number already present
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
