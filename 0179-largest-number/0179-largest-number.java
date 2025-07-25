class Solution {
    public String largestNumber(int[] nums) {
        int a=nums.length;
        String []s=new String[a];
        for(int i=0;i<a;i++){
            s[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){
                String s1=s[i]+s[j];
                String s2=s[j]+s[i];
                if(s2.compareTo(s1)>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        StringBuilder res=new StringBuilder();
        for(String str:s)
        res.append(str);
        if(res.charAt(0)=='0'){
            return "0";
        }
        return res.toString();
    }
}