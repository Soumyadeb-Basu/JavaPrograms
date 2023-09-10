package Java8Features.InterfaceRelatedProblems;

@FunctionalInterface
public interface DefaultMethodInterface {

    default void printGeneric() {
        System.out.println("Hello. In Interface default method.");
    }

    void print();

}
