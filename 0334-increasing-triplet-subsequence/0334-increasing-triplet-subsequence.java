class Solution {
    public boolean increasingTriplet(int[] nums) {

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;


        for(int n : nums){
            
            //see if the number is the smallest
            if(n <= firstSmallest){
                firstSmallest = n;
            } else if(n <= secondSmallest){ //see if its bigger than smallest but less than secondSmallest
                secondSmallest = n;
            } else{ //if we reach here, its bigger than first and second smallest, and it comes after both of them 
                return true;
            }
        }

        return false;

    }
}