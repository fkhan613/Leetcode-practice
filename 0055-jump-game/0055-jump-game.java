class Solution {
    public boolean canJump(int[] nums) {

        int finalPos = nums.length-1;

        for(int id = nums.length-2; id >= 0; id--){
            
            if(nums[id] + id >= finalPos){
                finalPos = id;
            }

        }

        return finalPos == 0;
        
    }
}