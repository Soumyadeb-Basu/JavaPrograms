package Java8Features.Streams;

import java.util.Arrays;

public class Stream_distinct_sorted_example {

    public static void main(String[] args) {

        String[] names= {"Arun", "Ramesh", "Chandra", "Bijoy","Arun"};

        Arrays.stream(names).sorted().distinct().forEach(System.out::println);

    }

}
