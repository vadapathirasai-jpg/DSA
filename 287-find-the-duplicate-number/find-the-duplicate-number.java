class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int x : nums){
            if(st.contains(x)){
                return x;
            }
            st.add(x);
        }
        return -1;
    }
}