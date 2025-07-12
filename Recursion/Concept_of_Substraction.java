package Recursion;

public class Concept_of_Substraction {
    public static void main(String[] args) {
        sub(5);
    }

    static void sub(int n) {
        if (n == 0) return;
        System.out.println(n);
        sub(--n);
//        sub(n--);              //StackOverflowError
    }
}
//    n--  :-  First pass the value and then decrement
//    --n  :-  First decrement the value and then pass