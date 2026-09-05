class Solution {
    void backtrack(List<List<Integer>> ans, int[] nums, List<Integer> curr, int i){
        if(i == nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        //pick
        curr.add(nums[i]);
        backtrack(ans, nums, curr, i + 1);


        // Not pick
        curr.remove(curr.size() -1);
        backtrack(ans, nums, curr, i + 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, nums, new ArrayList<>(), 0);
        return ans;
    }
}