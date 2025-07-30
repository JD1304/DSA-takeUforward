class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        String lastword = words[words.length - 1];
        return lastword.length();
        
    }
}