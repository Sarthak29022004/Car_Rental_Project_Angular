package Maths_DSA;

public class Find_ith_bit_of_number {
    public static void main(String[] args) {
        System.out.println(bit(6,1));  //0110
    }

    static int bit(int num, int i) {
        return (num >> i) & 1;
    }
}
