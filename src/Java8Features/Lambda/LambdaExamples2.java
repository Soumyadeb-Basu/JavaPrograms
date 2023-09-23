package Java8Features.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaExamples2 {

    public static void main(String[] args) {

        List<String> words= Arrays.asList("qwer","abcde","tewqa");
//convert strings to Uppercase
        List<String> lowerCaseWords= words.stream().map(String::toUpperCase).collect(Collectors.toList());
        lowerCaseWords.forEach(System.out::println);
        System.out.println("-------------");
        // sort in alphabetical order
        List<String> sortedWords= words.stream().sorted().collect(Collectors.toList());
        sortedWords.forEach(System.out::println);
        System.out.println("-------------");
        //Check Palindrome string
        Predicate<String> checkPalindrome= (str)->
        {
            StringBuilder reverse= new StringBuilder();
            for(int i=str.length()-1;i>=0;i--)
                reverse.append(str.charAt(i));
            return str.contentEquals(reverse);
        };
        System.out.println(checkPalindrome.test("madam"));
        System.out.println(checkPalindrome.test("black"));
        System.out.println("-------------");
        //Check for specific word in list of words
        System.out.println(words.stream()
                .anyMatch(s->s.equals("abcd")));
        System.out.println(words.stream()
                .anyMatch(s->s.equals("abcde")));
        System.out.println("-------------");
        //Print length of shortest and longest word in list of words
        System.out.println(words.stream()
                .map(String::length).max(Integer::compareTo).get());
        System.out.println(words.stream()
                .map(String::length).min(Integer::compareTo).get());
        System.out.println("-------------");
        //Print average length of all words in list of words
        //mapToInt() returns an IntStream on which we can perform average
        System.out.println(words.stream()
                .mapToInt(String::length).average().orElse(0));

    }
}
