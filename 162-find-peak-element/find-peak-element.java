class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length -1;
        if(n == 0 || nums[0] > nums[1] ) { return 0; }
        if(nums[n] > nums[n-1]) { return n; }
        int l = 1, r = n -1;
        while( l <= r ){
            int mid = l + ( ( r - l) >> 1);
            if(nums[mid] > nums[mid -1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid-1] > nums[mid]){
                r = mid - 1;
            }
            else if( nums[mid +1] > nums[mid]){
                l = mid + 1;
            }
        }
        return -1;
    }
}