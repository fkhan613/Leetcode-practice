class Solution {
    public boolean isSubsequence(String s, String t) {

        //define i and j to 0
        int i = 0;
        int j = 0;

        //loop while i is less than s and while j is less than t
        while(i < s.length() && j < t.length() ){

            //only increment i when you the character at the ith position in s is the same as the jth postion in t
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }

            j++;
        }

        //when you finish the loop return if i == s.length
        return i == s.length();
        
    }
}