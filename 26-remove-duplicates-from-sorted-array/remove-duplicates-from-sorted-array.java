class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length; int count = 0;
        for(int i = 1; i < n; i++){
            if( nums[count] != nums[i]){
                nums[++count] = nums[i];
            }
        }
        return count + 1;
    }
}