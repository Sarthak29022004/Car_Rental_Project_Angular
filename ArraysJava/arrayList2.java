package ArraysJava;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int c = 0;
        System.out.print("Enter numbers : ");
        while (c < 5) {
            list.add(in.nextInt());
            c++;
        }
        System.out.println(list);
    }
}
