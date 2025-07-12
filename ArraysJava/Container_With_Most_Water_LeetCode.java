package ArraysJava;

public class Container_With_Most_Water_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 1};
        System.out.println(maxArea(arr));
    }

    static int maxArea(int[] height) {
        int ans = 0;
        int s = 0;
        int e = height.length - 1;
        while (e > s) {
            int w = Math.min(height[s],height[e])*(e-s);
            ans = Math.max(ans,w);
            if(height[s]<height[e]){
                s++;
            } else{
                e--;
            }
        }
        return ans;
    }
}//        int ans = 0;
//        int w = 0;
//        while (w < height.length) {
//            int i = w+1;
//            int l = height.length - 1;
//            while (l >= i) {
//                int a = Math.min(height[w], height[i]) * (i - w);
//                int b = Math.min(height[w], height[l]) * (l - w);
//                ans = Math.max(ans,Math.max(a,b));
//                i++;
//                l--;
//            }
//            w++;
//        }
//        return ans;


//        for (int i = 0; i < height.length - 1; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                int w = Math.min(height[i], height[j]) * (j - i);
//                ans = Math.max(w, ans);
//            }
//        }