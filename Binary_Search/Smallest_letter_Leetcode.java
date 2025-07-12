package Binary_Search;

public class Smallest_letter_Leetcode {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char s = smallchar(letters, 'g');
        System.out.println(s);
        System.out.println(smallchar2(letters, 'g'));
    }

    static char smallchar(char[] letters, char target) {
        int store = 0;
        if (target > letters[letters.length - 1] || target < letters[0]) {
            return letters[0];
        }
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[store];
    }

    static char smallchar2(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
