class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        int firstRowC = 0;
        int secondRowC = 0;
        int thirdRowC = 0;
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            firstRowC = 0;
            secondRowC = 0;
            thirdRowC = 0;
            for(int j=0;j<words[i].length();j++){
                if(firstRow.contains(String.valueOf(words[i].charAt(j)).toLowerCase())){
                    firstRowC++;
                }
                else if(secondRow.contains(String.valueOf(words[i].charAt(j)).toLowerCase())){
                    secondRowC++;
                }
                else {
                    thirdRowC++;
                }
            }
            if(thirdRowC==words[i].length() || firstRowC==words[i].length() || secondRowC== words[i].length() ){
                result.add(words[i]);
            }
        }
        String[] resultWords = result.toArray(new String[result.size()]);  
        return resultWords;
    }
}
