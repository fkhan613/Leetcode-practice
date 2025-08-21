class Solution {
    public boolean isPalindrome(String s) {

        if(s == null){
            return false;
        }

        //this will replace all alphanumeric letters
        String newString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        //use double pointer to check if the string is a palindrome
        int first = 0;
        int last = newString.length()-1;

        while (first < last){

            if(newString.charAt(first) != newString.charAt(last)){
                return false;
            }

            first++; last--;
        }

        return true;
    }
}