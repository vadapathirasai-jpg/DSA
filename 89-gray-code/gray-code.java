class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int k = 0; k < ( 1 << n ); k++){
            int a = k ^ (k >> 1);
            ans.add(a);
        }
        return ans;
    }
}