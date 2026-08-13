class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        // if( n < k ){
        //     int m = k - n;
        //     str.append(s);
        //     while( m-- != 0 ){
        //     str.append(fill);
        //     }
        //     return new String[]{str.toString()};
        // }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            str.append(s.charAt(i));
            if( str.length() == k ){
                ans.add(str.toString());
                str.setLength(0);
            }
        }
        if( str.length() > 0 && str.length() < k ){
            int m = k - str.length();
            while( m-- != 0 ){
                str.append(fill);
            }
            ans.add(str.toString());
        }
        
        String[] ansArray = ans.toArray(String[]::new);
        return ansArray;
    }
}