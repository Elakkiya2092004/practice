class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr=s.toCharArray();
        char[] ar=t.toCharArray();
        int i=0;
        for(int j=0;j<ar.length&&i<arr.length;j++){
          if(arr[i]==ar[j]){
            i++;
          }
        }
        return i==arr.length;
    }
}