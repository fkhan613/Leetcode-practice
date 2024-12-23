class Solution {
    public String longestCommonPrefix(String[] strs) {

        //edge cases
        if(strs.length == 0 || strs == null) return "";

        //assume the first string is the prefix
        String prefix = strs[0];

        //loop through all strings starting at the second string
        for(int i = 1; i < strs.length; i++){

            //loop through the string and keep removing characters from the current prefix till it matches or is ""
            while(!strs[i].startsWith(prefix)){

                //remove a chracter from the end of the prefix
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.equals("")) return "";
            }
        }

        //if we reach here, then there was a successful common prefix between all strings
        return prefix;
    }
}