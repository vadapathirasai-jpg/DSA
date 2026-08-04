class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        Arrays.sort(nums);
        int missing = nums[0];
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            while(missing != nums[i]){
                arr.add(missing);
                missing++;
            }
            missing++;
        }
        return arr;
    }
}