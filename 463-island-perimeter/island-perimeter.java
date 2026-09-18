class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] direction = {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
        };
        int count = 0;

        int maxArea = 0;

        Queue<int[]> q = new LinkedList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int area = 0;
                if(grid[i][j] == 1){
                  //  area++;
                    grid[i][j] = 6;
                    q.offer(new int[]{i, j});
                    while( !q.isEmpty() ){
                        int[] p = q.poll();
                        int x = p[0];
                        int y = p[1];
                        for(int k = 0; k < 4; k++){
                            int nx = x + direction[k][0];
                            int ny = y + direction[k][1];
                            if( nx < 0 || ny < 0 || nx >= n || ny >= m || grid[nx][ny] == 0){
                             count++;
                                continue;
                            }
                            if(grid[nx][ny] == 1){
                           //     area++;
                               grid[nx][ny] = 6;
                                q.offer(new int[]{nx, ny});
                            }
                        }
                    }
                    maxArea = Math.max(maxArea, area);
                }


            }
        }
        return count;
       // return maxArea;
    }
}