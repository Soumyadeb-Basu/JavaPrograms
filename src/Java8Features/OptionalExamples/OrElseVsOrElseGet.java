package Java8Features.OptionalExamples;

import java.util.Optional;

public class OrElseVsOrElseGet {

    public static void main(String[] args) {

        Optional<String> str1= Optional.ofNullable(null);
        System.out.println(str1.orElseGet(()->  "Null String in orElseGet method"));

        Optional<String> str2 = Optional.ofNullable(null);
        System.out.println(str2.orElse("Null String in orElse method"));

    }
}
