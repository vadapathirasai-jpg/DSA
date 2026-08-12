class Solution {
    public String reorderSpaces(String text) {
        int space = 0; String ans = "";
        for(char c : text.toCharArray()){
            if(c == ' '){
                space++;
            }
        }
        ArrayList<String> words = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        for(char c : text.toCharArray()){
            if(c != ' '){
                str.append(c);
            }
            else if(str.length() > 0){
                words.add(str.toString());
                str.setLength(0);
            }
        }
        if(str.length() > 0){
            words.add(str.toString());
        }
        if(words.size() == 1){
            ans += words.get(0);
            while(space-- != 0){
                ans += " ";
            }
            return ans;
        }
        int gaps = words.size()-1;
        int spaceBetween = space/gaps;
        int remainingSpace = space%gaps;
        
        for(int i = 0; i < words.size(); i++){
            ans += words.get(i); int gap = spaceBetween;
            while(i != words.size() -1 && gap != 0){
                ans += " ";
                gap--;
            }
        }
        if(remainingSpace > 0){
            while(remainingSpace-- != 0){
                ans+= " ";
            }
        }
        return ans;
    }
}