class Solution {
    int[] dp;
    int solve(int n){
        if( n == 0 ) {return 0; }
        int minN = Integer.MAX_VALUE;
        if(dp[n] != -1){
            return dp[n];
        }
        int i = 1;
        while( i*i <= n){
            minN = Math.min(minN, 1 + solve(n - i*i));
            i++;
        }
        dp[n] = minN;
        return dp[n];
    }
    public int numSquares(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n);
    }
}