class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites){

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }

        int[] inDegree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();


        for(int i = 0; i < prerequisites.length; i++){
            int u = prerequisites[i][1];
            int v = prerequisites[i][0];
            list.get(u).add(v);
            inDegree[v]++;
        }
        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                q.offer(i);
            }
        }
        int count = 0;
        while( !q.isEmpty() ){
            count++;
            int u = q.poll();
            ArrayList<Integer> l = list.get(u);
            for(int i = 0; i < l.size(); i++){
                int v = l.get(i);
                inDegree[v]--;
                if(inDegree[v] == 0){
                    q.offer(v);
                }
            }
        }

        return count == numCourses;
    }
}