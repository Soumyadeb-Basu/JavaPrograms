package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce_exmpl {

    public static void main(String[] args) {

        List<Integer> listOfIntegers= Arrays.asList(1,2,3,4,5);
        Integer result= listOfIntegers
                .stream()
                .reduce((a, b)->a*b)
                .get();
        System.out.println(result);

    }
}
