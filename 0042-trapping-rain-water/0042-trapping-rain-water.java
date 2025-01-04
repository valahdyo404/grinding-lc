class Solution {
    public int trap(int[] height) {
        int leftMax = 0;
        int rightMax = 0;
        int trappedWater = 0;

        int l = 0, r = height.length - 1;

        while (l < r) {
            leftMax = Math.max(leftMax, height[l]);
            rightMax = Math.max(rightMax, height[r]);

            if (leftMax < rightMax) {
                trappedWater += leftMax - height[l];
                l++;
            } else {
                trappedWater += rightMax - height[r];
                r--;
            }
        }
        return trappedWater;
    }
}