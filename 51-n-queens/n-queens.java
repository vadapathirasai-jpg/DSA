class Solution {

    void backtrack(List<List<String>> ans, char[][] board, int row, int n){
        if(row == n){
            ArrayList<String> temp = new ArrayList<>();
            for(int i = 0; i < n; i++){
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for(int j = 0; j < n; j++){
            if( isSafe(board, row, j) ){
                board[row][j] = 'Q';

                backtrack(ans, board, row + 1, n);

                board[row][j] = '.';
            }
        }
    }

    boolean isSafe(char[][] board, int row, int col){

        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        backtrack(ans, board, 0, n);

        return ans;
    }
}