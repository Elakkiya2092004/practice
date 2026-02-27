class Solution {
    public int countElements(int[] nums) {
        int max=-1000000;
        int maxCount=0;
        int min=100000;
        int minCount=0;
        for(int i:nums){
            if(i<min){
                min=i;
                minCount=1;
            }
            else if(i==min){
                minCount++;
            }
            if(i>max){
                max=i;
                maxCount=1;
            }
            else if(i==max){
                maxCount++;
            }
        }
        if(nums.length<=minCount+maxCount) return 0;
        return nums.length-minCount-maxCount;
    }
}