package ArraysJava;

import java.util.HashMap;
import java.util.Map;

public class find_multiple_duplicates {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = {3,6,7,4,3,7,24,24,6,78,76,34,9};
        for (int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
}
