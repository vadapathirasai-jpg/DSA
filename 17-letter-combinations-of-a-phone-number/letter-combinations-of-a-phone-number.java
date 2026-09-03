class Solution {
    String[] letters = {
        "",     //0
        "",     //1
        "abc",  //2
        "def",  //3
        "ghi",  //4
        "jkl",  //5
        "mno",  //6
        "pqrs", //7
        "tuv",  //8
        "wxyz"  //9
    };
    void solve(List<String> ans, int index, StringBuilder current, String digits){
        if( index == digits.length() ){
            ans.add(current.toString());
            return;
        }

        String letter = letters[digits.charAt(index) - '0'];
        for(int i = 0; i < letter.length(); i++){
        current.append(letter.charAt(i));
        solve(ans, index + 1, current, digits);
        current.deleteCharAt(current.length() -1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        solve(ans , 0, current, digits);
        return ans;
    }
}