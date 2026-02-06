class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        helper(n,"",list,0);
        return list;
    }
    private void helper(int n,String pro,List<String> list,int open){
        if(open ==0&& n==0){
            list.add(pro);
            return;
        }
        if(open>=0&& n!=0){
            helper(n-1,pro+"(",list,open+1);
        }
        if(open>0){
            helper(n,pro+")",list,open-1);
        }
    }
}