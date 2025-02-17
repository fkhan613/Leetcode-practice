class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length() ==1){
            return 0;
        }

        if(needle.length() > haystack.length()){
            return -1;
        }

        if(!(haystack.contains(needle))){
          return -1;  
        } 

        for(int i = 0; i < haystack.length(); i++){

            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;
        
    }
}