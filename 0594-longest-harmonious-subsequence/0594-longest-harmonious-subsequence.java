class Solution {
    public int findLHS(int[] nums) {
       int res=0;
       int i=0,j=0;
       Arrays.sort(nums);
       while(j<nums.length){
        if(nums[j]-nums[i] ==1){
            res=Math.max(res,j-i+1);
            j++;
        }
        else if(nums[j] - nums[i]==0){
            j++;
        }
        else{
            i++;
        }
       }
       return res<=1?0:res ;
    }
}