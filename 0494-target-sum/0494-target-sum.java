public class Solution {
    private static Map<String, Integer> memo;

    public int findTargetSumWays(int[] nums, int s) {
        memo = new HashMap<>();
        return backtrack(nums, s, 0);
    }

    private static int backtrack(int[] nums, int s, int index) {
        String curSerial = serialize(index, s);

        if (memo.containsKey(curSerial)){
            return memo.get(curSerial);
        }

        if (index == nums.length) {
            if (s == 0) return 1;
            return 0;
        }

        int ifMinus = backtrack(nums, s - nums[index], index+1);
        int ifPlus = backtrack(nums, s + nums[index], index+1);

        int numWays = ifMinus + ifPlus;
        memo.put(curSerial, numWays);
        return numWays;
    }
    private static String serialize(int index, int targetSum) {
        return index + "," + targetSum;
    }
}