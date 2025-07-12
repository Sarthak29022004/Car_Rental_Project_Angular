package Maths_DSA;

public class Count_Symmetric_Integers_LeetCode {
    public static void main(String[] args) {
        System.out.println(countSymmetricIntegers(1200, 1230));
    }

    static int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            int j = i;
            int len = (int) Math.log10(j) + 1;
            if (len % 2 != 0) {
                continue;
            }
            int length = len / 2;
            int ans1 = 0;
            int ans2 = 0;
            while (length > 0) {
                ans1 += j % 10;
                j /= 10;
                length--;
            }
            while (j > 0) {
                ans2 += j % 10;
                j /= 10;
            }
            if (ans1 == ans2) {
                ans++;
            }
        }
        return ans;
        //int c=0;
        //       for(int i=low;i<=high;i++){
        //        String s=String.valueOf(i);
        //        int len=s.length();
        //        if(len%2!=0)    continue;
        //        int half=len/2;
        //        int sum1=0;
        //        int sum2=0;
        //
        //        for(int j=0;j<half;j++){
        //            sum1+=s.charAt(j);
        //            sum2+=s.charAt(half+j);
        //
        //
        //
        //        }
        //            if(sum1==sum2){
        //            c++;
        //
        //
        //        }
        //        }
        //
        //return c;
    }
}
