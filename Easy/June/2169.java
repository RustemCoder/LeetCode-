class Solution {
    public int countOperations(int num1, int num2) {
        int operations=0;
        if(num2==0){
            return 0;
        }
        while(num1>0){
            
            if(num1>=num2){
                num1-=num2;
                operations++;
            }
            else{
                num2-=num1;
                operations+=1;
            }
        }
        
        return operations;
    }
}
