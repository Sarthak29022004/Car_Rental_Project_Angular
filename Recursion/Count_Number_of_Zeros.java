package Recursion;

public class Count_Number_of_Zeros {
    public static void main(String[] args) {
        System.out.println(count(1070405));   //3
    }

    static int count(int n) {
        if (n <= 0) return 0;
        if (n % 10 == 0) return count(n / 10) + 1;
        return count(n / 10);
    }
}

//        int c = 0;
//        if (n % 10 == 0) c = 1;
//        return count(n / 10) + c;