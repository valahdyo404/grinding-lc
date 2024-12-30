class Solution {
    public void sortColors(int[] nums) {
        
        int l = 0, m = 0, r = nums.length - 1;

        while (m <= r) {
            if (nums[m] == 0) {
                swap(nums, m, l);
                l++;
                m++;
            }
            else if (nums[m] == 2) {
                swap(nums, m, r);
                r--;
            }
            else {
                m++;
            }
        }
    }
    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}