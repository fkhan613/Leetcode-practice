class Solution {
    public String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder reversedWords = new StringBuilder();

        for(int i = words.length-1; i >= 0; i--){
            reversedWords.append(words[i] + " ");
        }

        return reversedWords.toString().trim();
    }
}