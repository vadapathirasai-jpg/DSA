class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0; int prefix = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for(int x : nums){
         prefix += x;
         if(mp.containsKey(prefix - k)){
            count += mp.get(prefix - k);
         }
         mp.put(prefix, mp.getOrDefault(prefix, 0) +1);
        }
        return count;
    
    }
}