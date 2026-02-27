import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
       int num[]=new int[n];
       int j=0;
       for(int i:nums){
        num[j++]=i;
       }
       Arrays.sort(num);
       List<Integer> list=new ArrayList<>();
       int c=1;
       for(int i=1;i<n;i++){
        if(num[i]==num[i-1]){
            c++;
        }
        else{
            if(c>n/3){
                list.add(num[i-1]);
            }
            c=1;
        }
       }
       if(c>n/3){
        list.add(num[n-1]);
       }
       return list;
    }
}