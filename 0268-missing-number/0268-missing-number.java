class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int accSum = 0;
        int expectedSum = 0;

        for(int i = 0; i <= n; i++){
            expectedSum += i;
        }

        for(int i = 0; i < n; i++){
            accSum += nums[i];
        }

        return expectedSum - accSum;
    }
}