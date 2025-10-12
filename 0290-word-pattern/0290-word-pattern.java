class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[] = s.split(" ");

        if(pattern.length() != word.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < word.length; i++) {
            if(map.containsKey(pattern.charAt(i)) && !map.get(pattern.charAt(i)).equals(word[i])) {
                return false;
            }
            else {
                if(!map.containsKey(pattern.charAt(i)) && set.contains(word[i])) {
                    return false;
                }
                else {
                    map.put(pattern.charAt(i), word[i]);
                    set.add(word[i]);
                }
            }
        }
        return true;
    }
}