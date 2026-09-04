class Solution {
    int[][] direction = {
        {0, 1},
        {0, -1},
        {1, 0},
        {-1, 0}
    };
    boolean dfs(char[][] board, String word, int r, int c, int index){
        if(index == word.length()){
            return true;
        }
        if( r < 0 || c < 0 || r >= board.length || c >= board[0].length){
            return false;
        }
        if(word.charAt(index) != board[r][c]){
            return false;
        }
        char temp = board[r][c];
        board[r][c] = '$';

        for(int[] dir : direction){
            int nr = r + dir[0];
            int cr = c + dir[1];

            if(dfs(board, word, nr, cr, index + 1)){
                return true;
            }
        }

        board[r][c] = temp;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        int r = board.length;
        int c = board[0].length;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
             if(dfs(board, word, i, j, 0)){
                return true;
             }
            }
        }
        return false;
    }
}