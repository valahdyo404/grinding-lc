class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> temp, int[] candidates, int target, int index) {
        if (target < 0) {
            return;
        }
        else if (target == 0) {
            result.add(new ArrayList<>(temp));
            return;
        } else {
            for (int i = index; i < candidates.length; i++) {
                if (i > index && candidates[i] == candidates[i-1]) continue;
                int number = candidates[i];
                temp.add(number);
                dfs(result, temp, candidates, target - number, i+1);
                temp.remove(temp.size()-1);
            }
        }
        
    }
}