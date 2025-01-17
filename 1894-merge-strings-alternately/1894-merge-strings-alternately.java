class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
        
        
        /* My solution
        String shorterWord = word1.length() >= word2.length() ? word2 : word1;  
        String longerWord = word1.length() >= word2.length() ? word1 : word2; 
        int j = 0;
        String result = "";

        //add the letters in alternating order, only loopthing throught thr smaller word
        for(int i = 0; i < shorterWord.length(); i++){

            result += word1.charAt(i);
            result += word2.charAt(j);
            j++;
        }

        //check if there is left over in the bigger string, if so, add it to the end of the result
        result += longerWord.substring(j);

        return result;
        */
        
    }
}