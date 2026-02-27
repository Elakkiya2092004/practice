class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int es=n*(n+1)/2;
        int as=0;
        int dn=0;
        boolean []seen=new boolean[n+1];
        for(int i:nums){
            as+=i;
            if(seen[i]){
                dn=i;
            }
            seen[i]=true;
        }

         
        int mn=es-(as-dn);
       
        
        return new int[]{dn,mn};
    }
}