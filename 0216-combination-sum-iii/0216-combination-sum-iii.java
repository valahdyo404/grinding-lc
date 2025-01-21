class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, k, n, new ArrayList<>(), 1);
        return result;
    }

    private void dfs(List<List<Integer>> result, int k, int target, List<Integer> comb, int index) {
        if (target == 0 && comb.size() == k) {
            result.add(new ArrayList<>(comb));
            return;
        } else if (comb.size() > k) {
            return;
        }

        for (int i = index; i <= 9; i++) {
            comb.add(i);
            dfs(result, k, target - i, comb, i+1);
            comb.remove(comb.size() - 1);
        }
    }
}