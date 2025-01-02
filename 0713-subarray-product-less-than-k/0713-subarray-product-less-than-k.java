class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        int count = 0;
        int l = 0;
        int product = 1;

        for (int r = 0; r < nums.length; r++) {
            product = product * nums[r];
            while (product >= k && l <= r) {
                product = product / nums[l];
                l++;
            }
            count += r - l + 1;
        }
        return count;
    }
}