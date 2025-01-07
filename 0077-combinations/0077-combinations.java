class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(result, temp, n, k, 1);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> temp, int n, int k, int index) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i <= n; i++) {
            temp.add(i);
            dfs(result, temp, n, k, i+1);
            temp.remove(temp.size() - 1);
        }
    }
}