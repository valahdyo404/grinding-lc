class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;

            if (i != 0 && nums[i] == nums[i-1]) continue;
            while (l < r) {
                int currSum = nums[i] + nums[l] + nums[r];
                if (Math.abs(currSum - target) < Math.abs(result - target)) {
                    result = currSum;
                }

                if (currSum < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}