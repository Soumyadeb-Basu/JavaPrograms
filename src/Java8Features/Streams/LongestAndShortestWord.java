package Java8Features.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestAndShortestWord {

    public static void main(String[] args) {
        List<String> words= Arrays.asList("Hi","I","am","Mahim");
        Optional<String> shortestWord= words
                .stream()
                .sorted(Comparator.comparingInt(String::length))
                .limit(1)
                .findFirst();

        Optional<String> longestWord= words
                .stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(1)
                .findFirst();

        System.out.println(shortestWord.get()+" "+longestWord.get());

    }
}
