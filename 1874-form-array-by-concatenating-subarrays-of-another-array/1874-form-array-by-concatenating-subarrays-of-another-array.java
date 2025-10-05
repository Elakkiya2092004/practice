class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int currentIndex = 0;
        for (int[] group : groups) {
            currentIndex = findGroup(nums, currentIndex, group);
            if (currentIndex == -1) {
                return false;
            }
        }
        return true;
    }

    private int findGroup(int[] nums, int start, int[] group) {
        int i = start;
        int j = 0;
        while (i < nums.length && j < group.length) {
            if (nums[i] == group[j]) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        return (j == group.length) ? i : -1;
    }
}
        
    
