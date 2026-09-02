class Solution {
    int[][] dp;
    int solve(String word1, String word2, int i, int j){
        if(i == word1.length()){
            return word2.length() - j;
        }
        if(j == word2.length()){
            return word1.length() - i;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(word1.charAt(i) == word2.charAt(j)){
            return 0 + solve(word1, word2, i+1, j+1);
        }
        int insert = 1 + solve(word1, word2, i, j + 1);
        int delete = 1 + solve(word1, word2, i + 1, j);
        int replace = 1 + solve(word1, word2, i + 1, j + 1);

        dp[i][j] = Math.min(insert, Math.min(delete, replace));
        return dp[i][j];
    }
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 0; i < word1.length() +1; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(word1, word2, 0, 0);
  }
}