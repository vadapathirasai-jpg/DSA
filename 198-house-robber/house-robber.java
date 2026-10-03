class Solution {
    int[] dp;
    int solve(int nums[], int i, int n){
        if( i >= n){
            return 0;
        }
  if(dp[i] != -1){
       return dp[i];
  }
  int take = nums[i] + solve(nums, i + 2, n);
  int notTake = solve(nums, i + 1, n);
  dp[i] = Math.max(take, notTake);
  return dp[i];
    }
    public int rob(int[] nums) {
        dp = new int[nums.length + 1];
        Arrays.fill(dp, -1);
        return solve(nums, 0, nums.length);
    }
}