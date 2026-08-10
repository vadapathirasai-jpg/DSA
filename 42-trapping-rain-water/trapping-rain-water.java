class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length -1;
        int totalWater = 0;
        int maxLeft = 0, maxRight = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(height[left] < maxLeft){
                    totalWater += (maxLeft - height[left]);
                }
                else
                {
                    maxLeft = height[left];
                }
                left++;
            }
            else{
                if(height[right] < maxRight){
                    totalWater += (maxRight - height[right]);
                }
                else
                {
                    maxRight = height[right];
                }
                right--;
            }
        }
        return totalWater;
    }
}