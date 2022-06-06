class Solution {
    public int[][] transpose(int[][] matrix) {
    
        int[][] newM = new int[matrix[0].length][matrix.length];
        
        for(int i =0;i<newM.length;i++){
            for(int j=0;j<newM[i].length;j++){
                newM[i][j] = matrix[j][i];
            }
        }
        
        return newM;
        
    }
}
