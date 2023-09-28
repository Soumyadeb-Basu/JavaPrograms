package Java8Features.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfNumbers {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,1,2,3,4,6,8,8);
        Map<Integer,Long> map= list
                .stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(Map.Entry<Integer,Long> mp: map.entrySet())
            System.out.println(mp.getKey() + " : " + mp.getValue());
    }
}
