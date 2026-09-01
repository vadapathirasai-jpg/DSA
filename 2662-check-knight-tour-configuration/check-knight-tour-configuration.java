class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0]!=0) return false;
        int n = grid.length;
        //int m = grid[0].length;
        int[][] pos = new int[n*n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                pos[grid[i][j]][0] = i;
                pos[grid[i][j]][1] = j;
            }
        }
        for(int i = 0; i < n*n-1; i++){
            int cr = pos[i][0];
            int cc = pos[i][1];

            int nr = pos[i+1][0];
            int nc = pos[i+1][1];

            int vr = Math.abs(cr - nr);
            int vc = Math.abs(nc - cc);

            if( !((vr == 1 && vc == 2) || (vr == 2 && vc == 1))){
                return false;
            }
        }
        return true;
    }
}