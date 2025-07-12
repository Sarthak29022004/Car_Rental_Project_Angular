package ArraysJava;

import java.util.ArrayList;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        System.out.println(kidsWithCandies(arr,3));
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        int max = 0;
        for (int num : candies) {
            if (num > max) {
                max = num;
            }
        }
        ArrayList<Boolean> arr = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (candies[i] + extraCandies >= max) {
                arr.add(true);
            } else{
                arr.add(false);
            }
        }
        return arr;
    }
}
