package Java8Features.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListPredicate {

    public static <T> List<T> checkPredicate(List<T> list, Predicate<T> predicate) {

        List<T> resultList = new ArrayList<>();
        for (T element : list) {
            if (predicate.test(element))
                resultList.add(element);
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Predicate<Integer> p1= num-> num%2==0;
        Predicate<Integer> p2= num-> num>4;

        System.out.println(ListPredicate.checkPredicate(list,p1));
        System.out.println(ListPredicate.checkPredicate(list,p2));
    }
}