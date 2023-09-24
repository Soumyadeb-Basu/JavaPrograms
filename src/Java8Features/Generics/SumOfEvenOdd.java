package Java8Features.Generics;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenOdd {

    public static  <T extends Number> void sum(List<T> list) {
        int evenSum=0;
        int oddSum=0;
        for(T element:list) {
            if(element.intValue()%2==0)
                evenSum += element.intValue();
            else
                oddSum += element.intValue();
        }
        System.out.println("EvenSum: "+evenSum+" OddSum: "+oddSum);
    }
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6);
        List<Long> longList =Arrays.asList(5432L,5643L,498543L,87654L);

        SumOfEvenOdd.sum(integerList);
        SumOfEvenOdd.sum(longList);


    }

}
