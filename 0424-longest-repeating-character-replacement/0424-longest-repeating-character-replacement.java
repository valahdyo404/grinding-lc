class Solution {
    public int characterReplacement(String s, int k) {
        int start = 0;
        int[] count = new int[26];

        int result = 0;
        int maxCount = 0;

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end) - 'A']++;
            maxCount = Math.max(count[s.charAt(end) - 'A'], maxCount);
            while (end - start + 1 - maxCount > k) {
                count[s.charAt(start) - 'A']--;
                start++;
            }
            result = Math.max(result, end-start+1);
        }
        return result;
    }
}