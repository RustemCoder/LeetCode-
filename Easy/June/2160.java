class Solution {
      public int minimumSum(int num) {
       int[] ans= new int[4]; 
        Arrays.fill(ans, 0); 
        int i = 0;
        while(num > 0){
        ans[i] = (num % 10);
        num/=10;
        i++;
    }
        Arrays.sort(ans);
        return ((ans[0] + ans[1] ) * 10) + (ans[2] + ans[3]); 
    }
}
