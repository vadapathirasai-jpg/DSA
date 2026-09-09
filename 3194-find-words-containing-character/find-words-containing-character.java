class Solution {
    public List<Integer> findWordsContaining(String[] words, char y) {
        ArrayList<Integer> ans = new ArrayList<>();
        int j = 0;
        for( String x : words ){
            int n = x.length();
            for(int i = 0; i < n; i++){
                if(x.charAt(i) == y) {
                    ans.add(j);
                    break;
                }
            }
            j++;
        }
        return ans;
    }
}