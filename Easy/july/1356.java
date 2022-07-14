class Solution {
    public int[] sortByBits(int[] arr) {
          int l =arr.length;
        for(int i=0;i<l;i++){
            arr[i]+=100001*Integer.bitCount(arr[i]);
        }
        Arrays.sort(arr);
        for(int i=0;i<l;i++){
            arr[i]=arr[i]%100001;
        }
        return arr;
    
    }
}
