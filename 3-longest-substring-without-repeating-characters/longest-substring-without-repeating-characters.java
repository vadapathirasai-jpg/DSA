class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int ans = 0;
        HashSet<Character> st = new HashSet<>();
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            while(st.contains(c)){
                st.remove(s.charAt(left));
                left++;
            }
            st.add(c);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}