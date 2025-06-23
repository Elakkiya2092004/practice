class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
        set.add(num);
        }
        Set<Integer> set2= new HashSet<>();
        for (int num : nums2){
            set2.add(num);
    }
    set.retainAll(set2);

        int[] res = new int[set.size()];
        int ind = 0;
        for (int i : set){ res[ind++] = i;
        }
        return res;


}
}