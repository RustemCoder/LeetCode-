//O(n*n)

class Solution {
    public int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];    
    int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum = 0;
            for(int j =0; j<=i;j++){
               sum+=nums[j] ;
            }
            result[i] = sum ;
        }
    
        return result;
    }
}


//O(n)

class Solution {
    public int[] runningSum(int[] nums) {
        int[] a = new int[nums.length];
            int sum =0;
            for(int i=0;i<nums.length;i++)
            {
                
                sum =sum+nums[i];
                a[i]=sum;
            }
        
        return a;
        
    }
}

//O(n) Time complexity. O(1) space complexity

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){        
            nums[i]+=nums[i-1];}    
        return nums;
    }
}
