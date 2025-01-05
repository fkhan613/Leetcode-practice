import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        //this hashmap will hold the characters in the magazine as the keys, the number of times they appeaed as the values
        HashMap<Character, Integer> map = new HashMap<>(); 

        /* structure
            {
                "a":1,
                "b"3

            }
        */ 

        //loop through the magazine string and add the count of each character to the hashmap
        for(int i = 0; i < magazine.length(); i++){
            //check if the hashmap contains the character
            if(map.containsKey(magazine.charAt(i))){
                int incOcc = map.get(magazine.charAt(i));
                incOcc++;
                map.put(magazine.charAt(i), incOcc);
            }else{
                map.put(magazine.charAt(i), 1);
            }

        }


        //loop through the ransom note
        for(int i = 0; i < ransomNote.length(); i++){

            //check if the current character in the note is in the hashmap and if the value is geq 1
            if(map.containsKey(ransomNote.charAt(i))){

                if(map.get(ransomNote.charAt(i)) >= 1){
                    int decOcc = map.get(ransomNote.charAt(i));
                    decOcc--;
                    map.put(ransomNote.charAt(i), decOcc);
                    continue;
                }

            }

            return false;
        }


        //return true out here since we foud all characters from the note in the magazine
        return true;
    }
}