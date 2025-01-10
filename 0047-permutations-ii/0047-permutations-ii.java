class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, used, nums, new ArrayList<>());
        return result;
    }

    private void dfs(List<List<Integer>> result, boolean[] used, int[] nums, List<Integer> temp) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i]) continue;
            if(i>0 &&nums[i-1]==nums[i] && !used[i-1]) continue;
            used[i] = true;
            temp.add(nums[i]);
            dfs(result, used, nums, temp);
            temp.remove(temp.size()-1);
            used[i] = false; 
        }
    }
}