package Java8Features.Lambda;

import java.util.function.Consumer;

public class ConsumerJoining {

    public static void main(String[] args) {
        Consumer<Integer> c1= System.out::println;
        Consumer<Integer> c2= t-> System.out.println(t*t);

        c1.andThen(c2).accept(4);
        c2.andThen(c1).accept(5);
    }

}
