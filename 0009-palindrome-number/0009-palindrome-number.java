class Solution {
    public boolean isPalindrome(int x) {

        //edge case
        if (x < 0) {
            return false;
        }

        long reversed = 0;
        long temp = x;

        while (temp != 0) {

            //gets the last digit
            int digit = (int) (temp % 10);

            //adds it to reversed
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}