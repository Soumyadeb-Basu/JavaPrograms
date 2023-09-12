package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class ForEachExmpl {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,4,6,8,9,12,34);
        list.stream().filter(n->n%2==0).forEach(System.out::println);

        System.out.println("-------");

        List<String> list2= Arrays.asList("hi","check","malayalam");
        list.stream().map(String::valueOf).forEach(System.out::println);


    }
}
