class Solution {
    void backtrack(int[] arr, ArrayList<Integer> sum ,int curr, int target, List<List<Integer>> ans,  int n, int i){
        if(curr == target){
            ans.add(new ArrayList<>(sum));
            return;
        }
        if( i >= arr.length || curr > target ){
            return;
        }
        //pick
        curr += arr[i];
        sum.add(arr[i]);
        backtrack(arr, sum, curr, target, ans, n, i);

        //Not pick
        curr -= arr[i];
        sum.remove(sum.size() -1);


        backtrack(arr, sum, curr, target, ans, n, i+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(candidates, new ArrayList<>(), 0, target, ans, candidates.length, 0);
        return ans;
    }
}