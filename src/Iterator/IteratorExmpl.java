package Iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExmpl {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,4,5,7);

        Iterator<Integer> it= list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        for (Integer integer : list) {

            System.out.println(integer);

        }

    }
}
