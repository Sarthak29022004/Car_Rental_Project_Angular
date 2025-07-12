package HashMaps_Java;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapValuesConcept {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,11);
        map.put(2,22);
        map.put(3,33);
        map.put(4,4);
        map.put(5,5);
        map.put(6,6);
        map.put(1,1);
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        System.out.println(list);
    }
}
