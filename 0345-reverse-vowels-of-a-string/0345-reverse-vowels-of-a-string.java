class Solution {
    public String reverseVowels(String s) {
       StringBuilder sb=new StringBuilder(s);
      int st=0;
      int e=s.length()-1;
      while(st<e){
       char l =sb.charAt(st);
       char r=sb.charAt(e);
       if(l!='a'&&l!='e'&&l!='i'&&l!='o'&&l!='u'&&l!='A'&&l!='E'&&l!='I'&&l!='O'&&l!='U'){
        st++;
       }
       else if(r!='a'&&r!='e'&&r!='i'&&r!='o'&&r!='u'&&r!='A'&&r!='E'&&r!='I'&&r!='O'&&r!='U'){
        e--;
      }
      else{
        char temp=sb.charAt(st);
        sb.setCharAt(st,sb.charAt(e));
        sb.setCharAt(e,temp);
        st++;
        e--;
        
      }

    }
    return sb.toString();
    }
}