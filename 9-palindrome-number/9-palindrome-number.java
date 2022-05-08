class Solution {
    public boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String reversed = "";
        
        for(int i = num.length() - 1; i >=0; i--){
            reversed += num.charAt(i);
        }
        
        if(num.equals(reversed)){return true;}else{return false;}
    }
}