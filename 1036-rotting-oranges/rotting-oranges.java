class Solution {
    
    public int orangesRotting(int[][] grid) {
        int[][] dis={{1,0},{0,1},{-1,0},{0,-1}};
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]==2){
                q.offer(new int[]{i,j});
            } if(grid[i][j]==1){
                fresh++;
            } 
            }
        }
        if(fresh==0){
            return 0;
        }
            int time=0;
            while(!q.isEmpty() &&fresh>0){
                int size=q.size();
                for(int i=0;i<size;i++){
                     int[] a=q.poll();
                int x=a[0];
                int y=a[1];
                for(int k=0;k<4;k++){
                    int nr=x+dis[k][0];
                    int nc=y+dis[k][1];
                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length &&grid[nr][nc]==1){
                        grid[nr][nc]=2;
                        q.offer(new int[]{nr,nc});
                        fresh--;
                    }
                }
                }
                time++;
            }
        if(fresh>0){
            return -1;
           } 
        return time;
    }
}