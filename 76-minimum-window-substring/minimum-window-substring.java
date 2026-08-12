class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(); int minWin = Integer.MAX_VALUE;
        int m = t.length(); int left = 0; int start = 0;
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> winElement = new HashMap<>();
        for( char c : t.toCharArray()){
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int required = need.size();
        int formed = 0;
        for(int right =0; right < n; right++){
            char c = s.charAt(right);
            winElement.put(c, winElement.getOrDefault(c, 0) + 1);
            if(need.containsKey(c) && need.get(c).equals(winElement.get(c))){
                formed++;
            }
            while(formed == required){
                if((right - left + 1) < minWin){
                    minWin = right - left + 1;
                    start = left;
                }
                char ch = s.charAt(left);
                winElement.put(ch, winElement.get(ch) -1);
                if(need.containsKey(ch) && winElement.get(ch) < need.get(ch)){
                    formed--;
                }
                left++;
            }
        }
        return minWin == Integer.MAX_VALUE ? "" : s.substring(start, start + minWin);
    }
}