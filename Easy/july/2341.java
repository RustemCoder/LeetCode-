class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] freq = new int[101];
        int[] ans = new int[2];
        for(int num : nums) {
            freq[num]++;
        }
        
        for(int num:freq) {
            if(num != 0) {
                ans[0] += num/2;
                ans[1] += num%2;
            }
        }
        
        return ans;
    }
}
