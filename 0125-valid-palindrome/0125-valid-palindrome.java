class Solution {
    public boolean isPalindrome(String s) {

        if(s == null){
            return false;
        }

        String newS = s.replaceAll("[\\P{Alnum}]", "").toLowerCase();

        if(newS.equals("")){
            return true;
        }


        int i = 0;
        int j = newS.length()-1;

        while(i < newS.length() && i !=j){
            if(newS.charAt(i) != newS.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
        
    }
}