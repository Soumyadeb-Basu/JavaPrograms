package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamMapExmpl {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> mappedList= list.stream().map(n->n^2+1).toList();

        System.out.println(mappedList);

        List<String> list2= Arrays.asList("Hi","I","am","Programming");
        System.out.println(list2.stream().map(String::toUpperCase).toList());

    }

}
