class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> freq=new LinkedHashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(freq.get(s.charAt(i))==1)
            return i;
        }
    
    return -1;
}
}