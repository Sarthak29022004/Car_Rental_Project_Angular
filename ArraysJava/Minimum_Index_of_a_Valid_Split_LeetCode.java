package ArraysJava;

import java.util.ArrayList;
import java.util.List;

public class Minimum_Index_of_a_Valid_Split_LeetCode {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(2);
//        list.add(2);
//        list.add(1);
//        list.add(3);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(7);
//        list.add(1);
//        list.add(2);
//        list.add(1);
        System.out.println(minimumIndex(list));
    }

    static int minimumIndex(List<Integer> nums) {
        int max = 0;
        int freq = 1;
        for (int num : nums) {
            if (num != max) {
                freq--;
                if (freq == 0) {
                    freq = 1;
                    max = num;
                }
            } else {
                freq++;
            }
        }
        int count = 0;
        for (int num : nums) {
            if (num == max) count++;
        }
        int index = 0;
        int n = nums.size();
        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) == max) {
                index++;
                if (index * 2 > i + 1 && (count - index) * 2 > (n-1-i) ){
                    return i;
                }
            }
        }
        return -1;
    }
}
