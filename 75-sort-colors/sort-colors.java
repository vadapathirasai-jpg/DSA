class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0 , r = n - 1;
        int mid = l;
        while( mid <= r ){
            if(nums[mid] == 0){
                int temp = nums[mid];
                    nums[mid] = nums[l];
                    nums[l] = temp;
                    mid++;
                    l++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                    nums[mid] = nums[r];
                    nums[r] = temp;
                    r--;
                  //  mid++;
            }
            else{
                mid++;
            }
        }
    }
}