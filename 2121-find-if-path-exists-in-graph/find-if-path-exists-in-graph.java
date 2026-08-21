class Solution {
    void dfs(ArrayList<ArrayList<Integer>> list, boolean[] visited, int s){
        visited[s] = true;
        for(int i = 0; i < list.get(s).size(); i++){
            int v = list.get(s).get(i);
            if(!visited[v]){
                dfs(list, visited, v);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n+1];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }
        int ns = edges.length;
        for(int i = 0; i < ns; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            list.get(u).add(v);
            list.get(v).add(u);
        }
        dfs(list, visited, source);
        return visited[destination];
    }
}