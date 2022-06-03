class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
           if(pairs.get(nums[i])==null){
               pairs.put(nums[i],1);
           }
            else{
                pairs.put(nums[i],pairs.get(nums[i])+1);
            }
        }
        
        for (Integer i : pairs.values()) {
            if(i%2!=0){
                return false;
            }
}
        
        return true;
        
    }
}
