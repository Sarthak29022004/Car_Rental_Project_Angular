package ArraysJava;

public class Count_Good_Triplets_LeetCode {
    public static void main(String[] args) {
        int[] arr = {3,0,1,1,9,7};
        System.out.println(countGoodTriplets(arr,7,2,3));
    }

    static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int ans = 0;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                if(Math.abs(arr[i] - arr[j])>a) continue;
                for(int k=j+1;k<n;k++){
                    if(Math.abs(arr[j] - arr[k])<=b && Math.abs(arr[i] - arr[k])<=c){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
