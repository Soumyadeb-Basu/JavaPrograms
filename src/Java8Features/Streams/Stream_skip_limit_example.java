package Java8Features.Streams;

import java.util.Arrays;

public class Stream_skip_limit_example {

    public static void main(String[] args) {

        int[] A ={ 1,2,3,5,6,8,9 };

        Arrays.stream(A)
                .skip(2)
                .limit(3)
                .forEach(System.out::println);


    }
}
