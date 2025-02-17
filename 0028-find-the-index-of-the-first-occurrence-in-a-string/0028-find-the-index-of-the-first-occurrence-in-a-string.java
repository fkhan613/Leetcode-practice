class Solution {
    public int strStr(String haystack, String needle) {

        if(needle.length() > haystack.length()){
            return -1;
        }

        if(haystack == null || needle == null){
            return -1;
        }


        for(int i = 0; i < haystack.length(); i++){

            for(int j = i+1; j <= haystack.length(); j++){
                String substring = haystack.substring(i, j);

                if(substring.equals(needle)){
                    return i;
                }
            }
        }

        return -1;        
    }
}