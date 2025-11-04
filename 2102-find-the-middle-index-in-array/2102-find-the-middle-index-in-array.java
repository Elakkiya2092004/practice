class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums==null||nums.length==0){ return -1;}
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum +=nums[i];
            }
            int pre=0; int suf=0;
            for(int i=0;i<nums.length;i++){
                suf=sum-pre;
                pre+=nums[i];
                if(pre==suf) return i;
            }
            return -1;
        }
    }
