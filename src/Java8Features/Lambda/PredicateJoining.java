package Java8Features.Lambda;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {
        Predicate<Integer> checkEven= n -> n%2== 0;

        Predicate<Integer> checkGreaterThanSix= n->n>6;

        System.out.println(checkEven.and(checkGreaterThanSix).test(4));

        System.out.println(checkEven.or(checkGreaterThanSix).test(4));

        System.out.println(checkEven.negate().test(12));
    }
}
