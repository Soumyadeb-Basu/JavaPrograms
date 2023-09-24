package Java8Features.Generics;

import java.util.HashMap;
import java.util.Map;

public class GenericMapOperations {

    public static <K,V> void printKeyValueOfMap(Map<K,V> map) {
        for(Map.Entry<K,V> mp: map.entrySet())
            System.out.println(mp.getKey()+": "+mp.getValue());
    }

    public static void main(String[] args) {
        Map<String,Integer> map1= new HashMap<>();
        map1.put("Hi",1);
        map1.put("Hello",2);
        GenericMapOperations.printKeyValueOfMap(map1);
    }

}
