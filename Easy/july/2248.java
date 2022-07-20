class Solution {
 public List<Integer> intersection(int[][] aa){
        int[] counts = new int[1_001];
        Arrays.stream(aa).forEach(a -> Arrays.stream(a).forEach(n -> counts[n]++));
        return IntStream.range(0, counts.length).filter(n -> counts[n] == aa.length).boxed().collect(Collectors.toList());
    }
}
