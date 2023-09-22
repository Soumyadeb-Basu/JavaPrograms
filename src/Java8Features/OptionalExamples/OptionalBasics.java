package Java8Features.OptionalExamples;

import java.util.Optional;

public class OptionalBasics {

    public static void main(String[] args) {
        Optional<String> name= Optional.ofNullable("Holmes");

        if(name.isPresent())
            System.out.println(name.get());
        else
            System.out.println("Null character");


    }
}
