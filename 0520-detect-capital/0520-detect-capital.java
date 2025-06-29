class Solution {
    public boolean detectCapitalUse(String word) {
        int upc=0;
        int loc=0;
        for(char c:word.toCharArray()){
            if(Character.isUpperCase(c)){
                upc++;
            }
            if(Character.isLowerCase(c)){
                loc++;
            }
        }
        if(upc==word.length()) return true;
        if(loc==word.length()) return true;
        if(upc==1&&Character.isUpperCase(word.charAt(0)))
        return true;
        return false;
    }
}