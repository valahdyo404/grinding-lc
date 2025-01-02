class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> checkSum = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int goal = target - nums[i];
            if (checkSum.containsKey(goal)) {
                result[0] = i;
                result[1] = checkSum.get(goal);
            } else {
                checkSum.put(nums[i], i);
            }
        }
        return result;
    }
}