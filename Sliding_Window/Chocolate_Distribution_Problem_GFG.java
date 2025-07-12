package Sliding_Window;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chocolate_Distribution_Problem_GFG {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//3, 4, 1, 9, 56, 7, 9, 12
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(56);
        list.add(7);
        list.add(9);
        list.add(12);
        Collections.sort(list);
        int m = 5;
        int n = list.size();
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < n - m + 1; i++) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + m; j++) {
                if (list.get(j) > max) max = list.get(j);
                if (list.get(j) < min) min = list.get(j);
            }
            diff = Math.min(diff, max - min);
        }
        System.out.println(diff);
    }
}
