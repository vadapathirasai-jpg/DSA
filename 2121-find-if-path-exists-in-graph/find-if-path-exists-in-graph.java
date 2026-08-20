class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
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
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        visited[source] = true;
        q.offer(source);

        while( !q.isEmpty()){
            int node = q.poll();
            if(node == destination){
                return true;
            }
            ArrayList<Integer> l = list.get(node);
            for(int i = 0; i < l.size(); i++){
                int next = l.get(i);
                if(!visited[next]){
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
        return false;
    }
}