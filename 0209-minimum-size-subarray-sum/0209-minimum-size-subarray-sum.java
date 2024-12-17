class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;

        int l = 0, r = 0, currSum = 0;

        while (r < nums.length) {
            currSum += nums[r];
            if (currSum >= target) {
                result = Math.min(result, r-l+1);
                while (currSum >= target) {
                    currSum -= nums[l];
                    l++;
                    if (currSum >= target) {
                        result = Math.min(result, r-l+1);
                    }
                }
            }
            r++;
        }
        if (result == Integer.MAX_VALUE) {
            return 0;
        } else {
            return result;
        }
    }
}