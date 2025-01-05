class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;
        HashMap<Character, String> map = buildMap();
        solve(digits, 0, res, map, "");
        return res;
    }

    private void solve(String digits, int index, List<String> res, HashMap<Character, String> map, String currString) {
        if (index == digits.length()) {
            res.add(currString);
            return;
        }

        String letters = map.get(digits.charAt(index));

        for (int i = 0; i < letters.length(); i++) {
            String newString = currString + letters.charAt(i);
            solve(digits, index + 1, res, map, newString);
        }
    }

    private HashMap<Character, String> buildMap() {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
}