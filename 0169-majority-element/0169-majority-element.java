class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int currentMaxOcc = 0;
        int currentMaxOccNum = 0;

        //loop through the array and count the number of occurences each element has
        for(int i = 0; i < nums.length; i++){

            //check if the number has been seen, if so increment the number of occurences
            if(map.containsKey(nums[i])){
                
                int incrementedOcc = map.get(nums[i]);
                incrementedOcc++;
                map.put(nums[i], incrementedOcc);

            } else{
                map.put(nums[i], 1);
            }

            //keep track of the currentMaxOcc and number
            if(map.get(nums[i]) > currentMaxOcc){
                currentMaxOcc = map.get(nums[i]);
                currentMaxOccNum = nums[i];
            }

        }

        return currentMaxOccNum; 

    }
}