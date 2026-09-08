class Solution {
    public int search(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        while( left <= right ){
            int mid = left + ( ( right - left ) >> 1);
            if(nums[mid] == k){
                return mid;
            }
            else if( nums[left] <= nums[mid]){
                if(k >= nums[left] && k < nums[mid]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
            else{
                if(k <= nums[right] && k > nums[mid]){
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}