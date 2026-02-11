class Solution {
    public int singleNumber(int[] nums) {
       int sum=0;
       int res=0;
       for(int i:nums){
        sum^=i&~res;
        res^=i&~sum;
       }
       return sum;
    }
}