class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;

        int[][] direction = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    grid[i][j] = '0';
                  //  count++;
                    q.add(new int[]{i, j});
                    while( !q.isEmpty() ){
                        int[] p = q.poll();
                        int x = p[0];
                        int y = p[1];
                        for(int k = 0; k < 4; k++){
                            int nx = x + direction[k][0];
                            int ny = y + direction[k][1];
                            if(nx >= m || ny >= n || nx < 0 || ny < 0 || grid[nx][ny] == '0'){
                                continue;
                            }
                            if(grid[nx][ny] == '1'){
                                grid[nx][ny] = '0';
                                q.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }
}