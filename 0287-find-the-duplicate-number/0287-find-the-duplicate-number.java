class Solution {
    public int findDuplicate(int[] nums) {
        //int n=nums.length;
        boolean[] arr=new boolean[nums.length];
        for(int num:nums){
        if(arr[num]){
return num;
        }
        else{
            arr[num]=true;
        }
    }
    return -1;
}
}