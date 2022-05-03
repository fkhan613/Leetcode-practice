class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] retVal = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            for(int j = 0; j < nums.length; j++){
                
                if(nums[i] + nums[j] == target && j!=i){
                    
                    retVal[0] = j;
                    retVal[1] = i;
                }
            }
        }
        
        return retVal;
    }
}