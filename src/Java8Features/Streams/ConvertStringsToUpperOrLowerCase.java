package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertStringsToUpperOrLowerCase {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("ABC","def","Ghi");
        Scanner sc= new Scanner(System.in);
        List<String> result;

        System.out.println("Enter you choice: 'Uppercase' or 'Lowercase'");
        String str= sc.next();

        if(str.equalsIgnoreCase("Uppercase"))
            result= list
                    .stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
        else
            result= list
                    .stream()
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());

        System.out.println(result);
    }
}
