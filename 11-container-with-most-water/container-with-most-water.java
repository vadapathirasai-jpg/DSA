class Solution {
    public int maxArea(int[] arr) {
        int left = 0, right = arr.length -1;
        int maxWater = 0;
        while(left < right){
            maxWater = Math.max(maxWater, (Math.min(arr[left], arr[right]) * (right - left)));
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxWater;
    }
}