class Solution {
    public String reverseWords(String s) {

        //split the string into an array of words
        String[] words = s.trim().split(" ");
        String result = "";

        //loop through the array of words backwards, and add the trimmed string to the result
        for(int i = words.length-1; i >=0; i--){
            if(!words[i].equals("")){
                result += words[i] + " ";
            }
        }

        return result.trim();
    }
}