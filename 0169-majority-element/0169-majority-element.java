class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int currentMaxOccurences = 0;
        int currentMaxNum = 0;

        /**
            {
                num : occurences 
            }

         */

         if(nums.length <= 1){
            return nums[0];
         }


        for(int i = 0; i < nums.length; i++){

            if(map.containsKey(nums[i])){
                int incrementedOcc = map.get(nums[i]);
                incrementedOcc++;

                map.put(nums[i], incrementedOcc);
            } else{
                map.put(nums[i], 1);
                continue;
            }

            if(map.get(nums[i]) > currentMaxOccurences){
                currentMaxOccurences = map.get(nums[i]);
                currentMaxNum = nums[i];
            }
        }

        return currentMaxNum;
    }
}