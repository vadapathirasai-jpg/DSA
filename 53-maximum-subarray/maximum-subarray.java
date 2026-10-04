class Solution {
    public int maxSubArray(int[] nums) {
        int window = nums[0];
        int maxValue = nums[0];
        for(int i = 1; i < nums.length; i++){
            window = Math.max( window + nums[i], nums[i]);
            maxValue = Math.max(window, maxValue);
        }
        return maxValue;
    }
}