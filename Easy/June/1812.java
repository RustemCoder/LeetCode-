class Solution {
    public boolean squareIsWhite(String coordinates) {
        if(coordinates.contains("a") || coordinates.contains("c") || coordinates.contains("e") || coordinates.contains("g")){
            if(Character.getNumericValue(coordinates.charAt(1))%2!=0){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            if(Character.getNumericValue(coordinates.charAt(1))%2!=0){
                return true;
            }
            else{
                return false;
            }
        }
    }
}
