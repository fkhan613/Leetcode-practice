import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //this hashmap will store the values of the nums array as keys and their indexes as the value
        HashMap<Integer, Integer> map = new HashMap<>();

        //loop through the nums array
        for(int i = 0; i < nums.length; i++){

            //if we find a duplicate
            if(map.containsKey(nums[i])){

                //check if the differnce of the current index and the first occurance index is ewual to k
                boolean validDupe = (Math.abs(i - map.get(nums[i])) <= k);

                if(validDupe){
                    return true;
                } else{
                    //update that dupe with the new index
                    map.put(nums[i], i);
                }

            } else{ //no duplicate found, just add it to the map
                map.put(nums[i], i);
            }
        }

        return false;
    }
}