class Solution {
    void backtrack(List<List<Integer>> ans, int[] nums, List<Integer> combo, boolean[] visited){
        if(nums.length == combo.size()){
            ans.add(new ArrayList<>(combo));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            combo.add(nums[i]);

            backtrack(ans, nums, combo, visited);

            visited[i] = false;
            combo.remove(combo.size() -1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(ans, nums, new ArrayList<>(), visited);
        return ans;
    }
} 