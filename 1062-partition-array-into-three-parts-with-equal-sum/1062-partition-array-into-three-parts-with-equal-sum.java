class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int t=0;
        for(int i=0;i<arr.length;i++){
            t+=arr[i];
        }
        if(t%3!=0){
            return false;
        }
        int cs=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs==t/3){
                c++;
                cs=0;}
                if(c==2 && i<arr.length-1){
                    return true;
                }
            }
            return false;
        }
    }
