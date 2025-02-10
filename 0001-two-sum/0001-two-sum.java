import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //{value:index}
        HashMap<Integer, Integer> compliments = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){

            int compliment = target - nums[i];

            //check if the compliment is in our hashmap
            if(compliments.containsKey(compliment)){
                return new int[] {i, compliments.get(compliment)};
            } else{
                compliments.put(nums[i], i);
            }

        }

        return new int[] {};

    }
}