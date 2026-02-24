class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            StringBuilder next=new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int num=((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
                next.append(num);
            }
            s=next.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}