class Solution {
    public int lengthOfLastWord(String s) {

        String newString = s.trim();
        String[] words = newString.split(" ");

        return words[words.length-1].length();
        
    }
}