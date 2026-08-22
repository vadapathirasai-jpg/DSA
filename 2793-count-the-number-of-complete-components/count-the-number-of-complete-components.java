class Solution {
    int vertices = 0;
    int edges = 0;
    void dfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, int src){
        visited[src] = true;
        vertices++;
        edges += list.get(src).size();
        for(int i = 0; i < list.get(src).size(); i++){
            int next = list.get(src).get(i);
            if( !visited[next] ){
                dfs(list, visited, next);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        boolean[] visited = new boolean[n+1];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                vertices = 0;
                this.edges = 0;
                dfs(list, visited, i);
                int r = (vertices*((vertices-1)))/2;
                if( r == this.edges/2)
                count++;
            }
        }
        return count;
    }
}