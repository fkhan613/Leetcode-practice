import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        //create a hashmap mapping each roman numeral to their respective value
        HashMap<String, Integer> map = new HashMap<>(){{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
            put("IV", 4);
            put("IX", 9);
            put("XL", 40);
            put("XC", 90);
            put("CD", 400);
            put("CM", 900);
        }};

        //this will hold the final roman numeral to integer
        int finalNumber = 0;

        //loop through the string 2 characters at a time to ensure we account for the IV and CM type numerals
        for(int i = 0; i < s.length(); i++){

            //ensure we dont get a index out of bounds
            if(i+1 < s.length()){

                //check 2 characters at a time first
                if(map.containsKey(s.substring(i, i+2))){
                    finalNumber += map.get(s.substring(i, i+2));
                    i +=1;
                    continue;
                }
            } 
                
            finalNumber += map.get(s.substring(i, i+1));
            
        }

        //return the final number
        return finalNumber;
        
    }
}