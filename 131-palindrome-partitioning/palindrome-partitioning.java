class Solution {
    void backtrack(List<List<String>> ans, String s, int start, List<String> curr){
        if(s.length() == start){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int end = start; end < s.length(); end++)
        {
            if( isPalindrome(s, start, end) ){
                curr.add(s.substring(start, end+1));
                
                backtrack(ans, s, end + 1, curr);

                curr.remove(curr.size() -1);
            }
        }
    }
    boolean isPalindrome(String s, int start, int end){
        while( start < end ){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(ans, s, 0, new ArrayList<>());
        return ans;
    }
}