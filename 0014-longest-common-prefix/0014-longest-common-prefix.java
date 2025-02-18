class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null || strs.length == 0){return "";}

        //use the first string as a prefix
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){

            //another loop while
            while(!(strs[i].startsWith(prefix))){
                prefix = prefix.substring(0, prefix.length()-1);
            } 

            if(prefix.equals("")){
                return "";
            }
        }

        return prefix;

    }
}