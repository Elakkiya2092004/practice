class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        List<Integer> al=new ArrayList<>();
        List<Integer> bl=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(i<=s.length()-a.length()&&a.equals(s.substring(i,i+a.length()))){
                al.add(i);
            }
            if(i<=s.length()-b.length()&&b.equals(s.substring(i,i+b.length()))){
                bl.add(i);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<al.size();i++){
            for(int j=0;j<bl.size();j++){
                if(Math.abs(al.get(i)-bl.get(j))<=k){
                    ans.add(al.get(i));
                    break;
                }
            }
        }
        return ans;
    }
}