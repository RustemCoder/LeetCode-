class Solution {
    public String firstPalindrome(String[] words) {
        for(int i =0 ;i<words.length;i++){
            StringBuffer text = new StringBuffer(words[i]);
            text.reverse();
            if(words[i].equals(text.toString())){
                return words[i];
            }
        }
        return "";
    }
}
