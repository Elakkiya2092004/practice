class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int s=0;
     for(int i=0;i<k;i++){
        s+=nums[i];
     }   
     int maxs=s;
     for(int i=k;i<nums.length;i++){
        s+=nums[i]-nums[i-k];
        maxs=Math.max(maxs,s);
     }
     return (double)maxs/k;    }
}