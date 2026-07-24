class Solution {
    int firstOccur(int[] arr, int k){
        int l = 0, r = arr.length -1;
        int ans = -1;
        while( l <= r ){
            int mid = l + ( ( r - l) >> 1);
            if( arr[mid] == k){
                ans = mid;
                r = mid - 1;
            }
            else if(arr[mid] < k){
               l = mid +1;
            }
            else{
                r = mid -1;
            }
        }
        return ans;
    }

    int lastOccur(int[] arr, int k){
        int l = 0, r = arr.length -1;
        int ans = -1;
        while( l <= r ){
            int mid = l  + ( ( r - l ) >> 1);
            if( arr[mid] == k){
                ans = mid;
                l = mid +1;
            }
            else if(arr[mid] > k){
                r = mid - 1;
            }
            else{
                l = mid +1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccur(nums, target), lastOccur(nums, target)};
    }
}