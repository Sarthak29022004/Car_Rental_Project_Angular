package Maths_DSA;

public class Maximum_Prime_Difference_LeetCode {
    public static void main(String[] args) {
        int[] ar = {4,2,9,5,3};
        System.out.println(maximumPrimeDifference(ar));
    }

    static int maximumPrimeDifference(int[] nums) {
        boolean[] arr = new boolean[101];
        arr[0]=arr[1]=true;
        for (int i = 2; i * i <= 100; i++) {
            if (!arr[i]) {
                for (int j = i * 2; j <= 100; j = j + i) {
                    arr[j] = true;
                }
            }
        }
        int len = nums.length;

        int minIn = 101;

        int maxIn = 0;
        for (int i = 0; i < len; i++) {
            int n = nums[i];
            if(!arr[n]){
                if (i<minIn){
                    minIn=i;
                }
                if(i>maxIn){
                    maxIn=i;
                }
            }
        }
        int ans = maxIn - minIn;
        return ans;
    }
}
