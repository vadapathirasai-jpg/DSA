class Solution {
    public boolean uniformArray(int[] nums1) {
       // Arrays.sort(nums1);

        int min = Integer.MAX_VALUE;
        boolean isAllEven = true;
        for(int x : nums1){
            min = Math.min(min, x);
            if( x % 2 == 1){
                isAllEven = false;
            }
        }
        return (min%2) == 1 || isAllEven;
    }
}