class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm=new HashMap<>();
        String[] sp1=s1.split(" ");
        String[] sp2=s2.split(" ");
        for(String w:sp1){
            hm.put(w,hm.getOrDefault(w,0)+1);
        }
        for(String w:sp2){
            hm.put(w,hm.getOrDefault(w,0)+1);
        }
        ArrayList<String> uc=new ArrayList<>();
        for(String w:hm.keySet()){
            if(hm.get(w) ==1){
                uc.add(w);
            }
        }
        return uc.toArray(new String[0]);
    }
}