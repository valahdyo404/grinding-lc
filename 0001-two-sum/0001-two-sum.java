class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checkSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int goal = target - nums[i];
            if (checkSum.containsKey(goal)) {
                return new int[]{i, checkSum.get(goal)};
            } else {
                checkSum.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}