class Solution {
    void merge(int[] arr1, int[] arr2, int[] arr){
        int n1 = arr1.length;
        int n2 = arr2.length;
        //int[] arr = new int[n1 + n2];

        int i = 0, j = 0, k = 0;
        while( i < n1 && j < n2 ){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while( i < n1 ){
            arr[k] = arr1[i];
            i++; k++;
        }
        while( j < n2 ){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] nums = new int[n];
        merge(nums1, nums2, nums);
        if( (n & 1 )== 1){
            return nums[n/2];
        }
        return ((double)nums[n/2] + (double)nums[n/2 - 1])/2;
        

    }
}