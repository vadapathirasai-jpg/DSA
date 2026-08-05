class Solution {
    int gcd(int a, int b){
        if(b == 0) {return a;}
        return gcd(b, a % b);
    }
    public long maxPairStrength(int[] nums) {
        long ans = 0; int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i +1; j < n; j++){
                int de = gcd(nums[i], nums[j]);
                long st = (1L*nums[i]*nums[j]) / (1L*de*de);
                ans = Math.max(st , ans);
            }
        }
        return ans;
    }
}