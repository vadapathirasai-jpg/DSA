class Solution {
    int[] dp;
    int max(int[] arr , int i,int n){
        if(i >= n){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int notPick = max(arr, i + 1, n);
        int pick = max(arr, i + 2, n) + arr[i];
       
        dp[i] = Math.max(notPick, pick);
         return dp[i];
    }
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return max(nums, 0 , n);
    }
}