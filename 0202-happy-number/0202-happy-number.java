import java.util.*;

class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getSum(n);
        }

        return n == 1;
        
    }

    //this method will return the sum of each dgit sqaured in the given parameter
    public int getSum(int n){

        int totalSum = 0;

        while(n !=0){

            int lastDigit = n % 10;
            totalSum += (lastDigit * lastDigit);
            
            //remove the last element
            n = n/10;
        }

        return totalSum;

    }
}