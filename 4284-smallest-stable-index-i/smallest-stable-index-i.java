class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int y = Integer.MAX_VALUE;
        int n = nums.length;
       // int ans = -1;
        for(int i = 0; i < n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j <= i; j++){
                if(max < nums[j]){
                    max = nums[j];
                }
            }
            int min = Integer.MAX_VALUE;
            for(int j = i; j < n; j++){
                if( min > nums[j] ){
                    min = nums[j];
                }
            }
            int x = max - min;
            if( x <= k && x < y){
                return i;
            }
        }
        return -1;
    }
}