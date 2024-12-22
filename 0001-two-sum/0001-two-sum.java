import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        //{value: index}
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){

            //find the compliment
            int comp = target - nums[i];

            //check if it exists in the hashmap
            if(map.containsKey(comp)){
                return new int[] {map.get(comp), i};
            }

            //if not, add it
            map.put(nums[i], i);


        }

        return nums;
    }
}