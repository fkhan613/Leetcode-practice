class Solution {
    public boolean isPalindrome(int x) {

        //covert int to string
        String stringX = String.format("%d", x);

        //loop through it backwards and see if the character match in reverse
        int frontIndex = 0;
        String reversed = "";

        //get the reversed string
        for(int i = stringX.length()-1; i >=0; i--){
            reversed = reversed + stringX.charAt(i);

        }

        //check fi they are equal
        return stringX.equals(reversed);
    }
}