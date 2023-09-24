package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;

public class MaxAndMinNumbersInStream {

    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8,9);

        int maxNumber= list1.stream()
                .max(Integer::compareTo)
                .get();

        int minNumber= list1.stream()
                .min(Integer::compareTo)
                .get();

        System.out.println(maxNumber+" and "+minNumber);
    }
}
