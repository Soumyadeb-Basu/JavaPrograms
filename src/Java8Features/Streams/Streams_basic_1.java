package Java8Features.Streams;

import java.util.List;
import java.util.stream.Stream;

public class Streams_basic_1 {

    public static void main(String[] args) {

        Stream<Integer> stream= Stream.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> listEven= stream.filter(n->n%2==0).toList();

        Stream<Integer> stream2= Stream.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> listOdd= stream2.filter(n-> n%2!=0).toList();

        System.out.println(listEven);

        System.out.println(listOdd);


    }

}
