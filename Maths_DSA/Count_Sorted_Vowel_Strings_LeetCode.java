package Maths_DSA;

public class Count_Sorted_Vowel_Strings_LeetCode {
    public static void main(String[] args) {
        System.out.println(countVowelStrings(4));
    }

    static int countVowelStrings(int n) {
        int ans = ((n + 1) * (n + 2) * (n + 3) * (n + 4)) / 24;
        return ans;
    }
}     // aeiou
//   1 = 5   10
//   2 = 15  20
//   3 = 35
//   4 = 70
//   33 = 66045
// aaa aai aae aao aau aee aii aoo auu aei aeo aeu aio aiu aou
// eee eei eeo eeu eii eoo euu eio eiu eou
// iii iio iiu ioo iuu iou
// ooo oou ouu
// uuu