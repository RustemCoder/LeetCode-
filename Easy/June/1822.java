class Solution {
    public int arraySign(int[] nums) {   
        return signFunc(nums);   
    }
    
    public int signFunc(int[] nums){
        int sum = 0 ;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                sum++;
            }
            else if(nums[i]==0){
                return 0;
            }
        }
        if(sum%2==0){
            return 1;
        }
        else{
            return -1;
       
    }
    }
}
