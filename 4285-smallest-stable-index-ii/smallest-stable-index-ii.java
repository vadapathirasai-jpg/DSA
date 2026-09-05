class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];

        for(int i = n-2; i >= 0; i--){
            suffix[i] = Math.min(nums[i], suffix[i+1]);
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){

            max = Math.max(max, nums[i]);
            
            int min = suffix[i];
            
            int y = max - min;
            if( y <= k){
                return i;
            }
        }
        return -1;
    }
}