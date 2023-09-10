package Java8Features.Streams;

import java.util.Arrays;

public class Stream_match_example {

    public static void main(String[] args) {

        int[] A= {1,2,3,4,5,6,7,8,11};

        //allMatch checks if all elements of stream matches the predicate condition
        System.out.println(Arrays.stream(A).allMatch(x->x<10));
        //anyMatch checks if any of the elements of stream matches the predicate condition
        System.out.println(Arrays.stream(A).anyMatch(x->x>10));


    }
}
