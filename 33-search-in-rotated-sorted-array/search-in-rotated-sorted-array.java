class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length -1;
        int l = 0, r = n;
        while(l <= r){
            int mid = l + ( ( r - l) >> 1);
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[l] <= nums[mid]){ //left part
                if(target >= nums[l] && target < nums[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{ //right part
            if(target > nums[mid] && target <= nums[r]){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
            }
        }
        return -1;
    }
}