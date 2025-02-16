class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);

        // //{character found in s : count}
        // HashMap<Character, Integer> sCharacters = new HashMap<Character, Integer>();

        // if(s.length() != t.length()) return false;

        // //loop through s and put the characters in the hashmap
        // for(int i = 0; i < s.length(); i++){

        //     if(sCharacters.containsKey(s.charAt(i))){
        //         int count = sCharacters.get(s.charAt(i));
        //         ++count;
        //         sCharacters.put(s.charAt(i), count);
        //     } else{
        //         sCharacters.put(s.charAt(i), 1);
        //     }

        // }

        // //loop through t and see if you the word is a valid anagram
        // for(int i = 0; i < t.length(); i++){

        //     //check if the current character is in the hashmap and has a count of >0
        //     if(sCharacters.containsKey(t.charAt(i)) && sCharacters.get(t.charAt(i)) > 0){
        //         //means we can use the character
        //         int decCount = sCharacters.get(t.charAt(i));
        //         --decCount;
        //         sCharacters.put(t.charAt(i), decCount);
        //     } else{
        //         return false;
        //     } 

        // }

        // return true;
        
    }
}