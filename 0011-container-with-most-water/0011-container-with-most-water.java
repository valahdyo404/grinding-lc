class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0, r = height.length-1;
        while (l < r) {
            int maxHeight = Math.min(height[l], height[r]);
            int currArea = maxHeight * (r-l);
            maxArea = Math.max(currArea, maxArea);
            if (height[r] < height[l]) {
                r--;
            } else {
                l++;
            }
        }
        return maxArea;
    }
}