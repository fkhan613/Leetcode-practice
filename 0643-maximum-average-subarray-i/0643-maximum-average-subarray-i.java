class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        int currentSum = 0;

        //find sum of first k elements
        for(int i = 0; i < k; i++){
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        //have a sliding window, and add the next numbers, re-calculating hte new average
        for(int i = k; i < n; i++){

            currentSum += nums[i] - nums[i-k];
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum * 1.0 / k;

        
    }
}