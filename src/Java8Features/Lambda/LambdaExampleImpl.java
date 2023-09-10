package Java8Features.Lambda;

public class LambdaExampleImpl {

    public static void main(String args[]) {

        LambdaExample obj1 = (a, b) -> a + b;

        LambdaExample obj2= (a,b)-> a*b;

        System.out.println(obj1.calculate(2, 3));

        System.out.println(obj2.calculate(4,5));

    }

}
