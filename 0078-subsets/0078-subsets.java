class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result = new ArrayList<>();
       List<Integer> temp = new ArrayList<>();
       dfs(result, temp, nums, 0);
       return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        result.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
        return;
    }
}