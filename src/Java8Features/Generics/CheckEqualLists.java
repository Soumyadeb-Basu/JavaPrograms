package Java8Features.Generics;

import java.util.Arrays;
import java.util.List;

public class CheckEqualLists {

    public static <T> boolean checkLists(List<T> list1, List<T> list2) {
        if(list1.size()!=list2.size())
            return false;
        for(int i=0;i<list1.size();i++) {
            if(list1.get(i)!= list2.get(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4);
        List<Integer> l2= Arrays.asList(1,2,3,4);
        List<Integer> l3= Arrays.asList(2,1,4,3);

        System.out.println(CheckEqualLists.checkLists(l1,l2));
        System.out.println(CheckEqualLists.checkLists(l1,l3));
    }
}
