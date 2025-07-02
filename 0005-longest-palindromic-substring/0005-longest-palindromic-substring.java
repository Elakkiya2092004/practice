class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        String res="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                    if(palin(sub)){
                        if(sub.length()>max){
                            res=sub;
                            max=sub.length();
                        }
                    }
                }
            }
        return res;
    }
    public static boolean palin(String s){
        int st=0;
        int e=s.length()-1;
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;}
            return true;
        
    }
}