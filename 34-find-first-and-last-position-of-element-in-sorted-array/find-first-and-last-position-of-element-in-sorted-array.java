class Solution {
    int firstOccur(int[] nums, int target){
        int n = nums.length; 
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while( left <= right ){
            int mid = left + ( ( right - left ) >> 1 );

            if(nums[mid] < target){
                
                left = mid + 1;
            }
            else{
                ans = mid;
                right = mid - 1;
            }
        }
        return ans;
    }
    int lastOccur(int[] nums, int target){
        int n = nums.length; 
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while( left <= right ){
            int mid = left + ( ( right - left ) >> 1 );

            if(nums[mid] > target){
                
                right = mid - 1;
            }
            else{
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int x = firstOccur(nums, target);
        if( x == -1 || nums[x] != target ){
            return new int[]{-1, -1};
        }
        int y = lastOccur(nums, target);

        return new int[]{x, y};
    }
}