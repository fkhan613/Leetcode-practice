class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> mappings = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){

            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //check if a mapping exists
            if(mappings.containsKey(sChar)){

                //check fi the mapping corresponds to the correct char
                if(mappings.get(sChar) != tChar){
                    return false;
                }
            }
            else if(mappings.containsValue(tChar)){
                return false;
            }
            else{
                mappings.put(sChar, tChar);
            }
        }

        return true;
    }
}