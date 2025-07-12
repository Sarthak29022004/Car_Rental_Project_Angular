package ArraysJava2;

public class Minimum_Domino_Rotations_For_Equal_Row_LeetCode {
    public static void main(String[] args) {
        int[] a = {6,1,6,4,6,6};
        int[] b = {5,6,2,6,3,6};
        System.out.println(minDominoRotations(a, b));
    }

    public static int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int[] arr = new int[7];
        for (int num : tops) {
            arr[num]++;
        }
        for (int num : bottoms) {
            arr[num]++;
        }
        int ri = 0;
        int rnum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ri) {
                rnum = i;
                ri = arr[i];
            }
        }
        int numInTom = 0;
        int numInBot = 0;
        for (int i = 0; i < n; i++) {
            if (tops[i] == rnum){
                numInTom++;
            }
            if (bottoms[i] == rnum){
                numInBot++;
            }
            if (tops[i] != rnum && bottoms[i] != rnum ){
                return -1;
            }
        }
        int max = Math.max(numInTom,numInBot);
        int ans = n - max;
        return ans;
    }
}
