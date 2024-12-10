class Solution {
    public double findMaxAverage(int[] nums, int k) {
       var sumFirst = 0;
       var maxSum = 0;

       for (int i = 0; i < k; i++) {
        sumFirst += nums[i];
       }
       var currSum = maxSum = sumFirst;
       for (int j = k; j < nums.length; j++) {
        currSum = currSum + nums[j] - nums[j-k];
        maxSum = Math.max(currSum, maxSum);
       }

       return maxSum/1.0/k;
    }
}