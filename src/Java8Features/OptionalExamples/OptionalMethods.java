package Java8Features.OptionalExamples;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) throws NoSuchNameExistsException {
        String input= "John";
        String input2= null;

        String name= Optional.ofNullable(input).orElse("Anonymous");
        System.out.println(name);

        String name2= Optional.ofNullable(input2).orElseThrow(()->new NoSuchNameExistsException("No such name exists"));
        System.out.println(name2);

    }
}
