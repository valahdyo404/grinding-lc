class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        dfs(result, "", 0, 0, n);
        return result;
    }

    private void dfs(List<String> result, String str, int open, int close, int n) {
        if (str.length() == n*2) {
            result.add(str);
            return;
        }

        if (open < n) {
            dfs(result, str + "(", open + 1, close, n);
        } 

        if (close < open) {
            dfs(result, str + ")", open, close + 1, n);
        }
    }
}