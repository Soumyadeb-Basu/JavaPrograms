package Java8Features.Streams;

import java.util.List;

public class Streams_basic_2 {

    public static void main(String[] args) {

        List<Integer> inputList= List.of(1,2,3,4,5,6);

        List<Double> squaresOfNumbers= inputList.stream().map(var->Math.pow(var,2)).toList();

        System.out.println(squaresOfNumbers);

    }
}
