class Solution {
    public boolean wordPattern(String pattern, String s) {

        //define a hashmap that stores the mappings of patterns to s
        HashMap<Character, String> mappings = new HashMap<Character, String>();
        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false; 
        }

        for(int i = 0; i < pattern.length(); i++){

            String currWord = words[i];
            char currChar = pattern.charAt(i);

            //check if the character maps to a word in mapping
            if(mappings.containsKey(currChar)){

                //check fi the currChar value equals the current word
                if(!(mappings.get(currChar).equals(currWord))){
                    return false;
                } 
            } 
            else if(mappings.containsValue(currWord)){
                return false;
            }
            else{
                mappings.put(currChar, currWord);
            }
        }

        return true;
    }
}