package ArraysJava;

public class Find_the_Punishment_Number_of_an_Integer_LeetCode {
    public static void main(String[] args) {
        System.out.println(punishmentNumber(37));
    }

    static int punishmentNumber(int n) {
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            int squre = j * j;
            int squreStore = 0;
            while (squre > 0) {
                int rem = squre % 10;
                squreStore = squreStore + rem;
                squre = squre / 10;
            }
            int store = 0;
            while (j > 0) {
                int rem = j % 10;
                store = store + rem;
                j = j / 10;
            }
            squre = i * i;
            if (store == squreStore) max = max + squre;
        }
        return max;
    }
}
