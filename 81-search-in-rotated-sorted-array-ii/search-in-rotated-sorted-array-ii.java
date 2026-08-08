class Solution {
    public boolean search(int[] nums, int k) {
         int left = 0;
         int right = nums.length-1;
         while(left <= right){
            int mid = left + ( (right - left) >> 1);
            if(nums[mid] == k){
                return true;
            }
            if(nums[mid] == nums[right] && nums[mid] == nums[left]){
                left++;
                right--;
                continue;
            }
            if(nums[mid] >= nums[left]){
                if(k < nums[mid] && k >= nums[left]){
                    right = mid -1;
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
                    right = mid -1;
                }
            }
         }
         return false;
    }
}