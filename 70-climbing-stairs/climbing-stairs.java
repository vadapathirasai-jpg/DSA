class Solution {
    int[] dp;
    int solve(int n){
        if( n == 0 || n == 1) { return 1; }
        if( dp[n] == -1){
            dp[n] = solve(n-1) + solve(n-2);
        }
        return dp[n];
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n);
    }
}