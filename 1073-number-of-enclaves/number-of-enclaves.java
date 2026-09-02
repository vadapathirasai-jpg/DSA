class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] direction = {
            {1, 0}, {-1, 0}, {0, 1}, {0, -1}
        };
        int one = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    one++;
                }
                if((i == 0 || j == 0 || i == m-1 || j == n-1) && grid[i][j] == 1){
                    grid[i][j] = 0;
                    q.offer(new int[]{ i , j });
                }
            }
        } 
        // while( !q.isEmpty()){
        //     int[] a = q.poll();
        //     System.out.println(a[0] + " " + a[1]);
        // }
        while( !q.isEmpty() ){
            int[] p = q.poll(); 
            one--;
            int x = p[0];
            int y = p[1];
            for(int i = 0; i < 4; i++){
                int nx = x + direction[i][0];
                int ny = y + direction[i][1];
                if(nx >= m || ny >= n || nx < 0 || ny < 0 || grid[nx][ny] == 0){

                    continue;
                }
                if(grid[nx][ny] == 1){
                    grid[nx][ny] = 0;
                    q.offer(new int[]{nx , ny});
                }

            }
        }
        // int count = 0;
        // for(int i = 0; i < m; i++){
        //     for(int j = 0; j < n; j++){
        //         if(grid[i][j] == 1){
        //             count++;
        //         }
        //     }
        // } 
        return one;
        
    }
}