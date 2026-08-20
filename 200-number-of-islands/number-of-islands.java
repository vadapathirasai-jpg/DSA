class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] direction = {
            {-1,0},{1,0},{0,1},{0,-1}
        };
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    count++;
                    Queue<int[]> q = new LinkedList<>();
                    q.offer(new int[]{i, j});
                    grid[i][j] = '0';
                    while( !q.isEmpty() ){
                        int[] p = q.poll();
                        int x = p[0];
                        int y = p[1];
                        for(int k = 0; k < direction.length; k++){
                            int nx = x + direction[k][0];
                            int ny = y + direction[k][1];
                            if( nx < 0 || ny < 0 || nx >= n || ny >= m){
                                continue;
                            }
                            if(grid[nx][ny] == '1'){
                                grid[nx][ny] = '0';
                                q.offer(new int[]{nx, ny});
                            }
                        }
                    }

                }
            }
        }
        return count;
    }
}