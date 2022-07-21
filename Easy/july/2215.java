class Solution {
   public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> tempSet = new HashSet<>();

    for (int i = 0; i < nums1.length; i++) {
        set1.add(nums1[i]);
        tempSet.add(nums1[i]);
    }

    for (int i = 0; i < nums2.length; i++)
        set2.add(nums2[i]);

    set1.removeAll(set2);
    set2.removeAll(tempSet);

    return List.of(set1.stream().toList(), set2.stream().toList());
}
}
