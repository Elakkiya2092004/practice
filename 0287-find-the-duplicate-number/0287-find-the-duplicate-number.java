class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int dn=0;
       boolean[] seen=new boolean[n+1];
       for(int i:nums){
        if(seen[i]){
        dn=i;
       }
       seen[i]=true;
    }
    return dn;
}
}