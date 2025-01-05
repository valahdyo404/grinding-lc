class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, new ArrayList<>(), candidates, target, 0);
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> comb, int[] candidates, int remain, int start) {
        if (remain < 0) return;
        else if (remain == 0) res.add(new ArrayList<>(comb));
        else {
            for (int i = start; i < candidates.length; i++) {
                comb.add(candidates[i]);
                dfs(res, comb, candidates, remain - candidates[i], i);
                comb.remove(comb.size() - 1);
            }
        }
    }
}