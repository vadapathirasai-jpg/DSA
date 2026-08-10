class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int find = target - nums[i];
            if(mp.containsKey(find)){
                return new int[]{mp.get(find), i};
            }
            mp.put(nums[i], i);
        }
        return new int[]{};
    }
}