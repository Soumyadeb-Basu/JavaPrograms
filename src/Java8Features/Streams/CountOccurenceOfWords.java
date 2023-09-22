package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfWords {

    public static void main(String[] args) {
        String str= "Hi Hello Hi Hello Hello";
        List<String> list= Arrays.asList(str.split(" "));
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)->System.out.println(k+" : "+v));

    }
}
