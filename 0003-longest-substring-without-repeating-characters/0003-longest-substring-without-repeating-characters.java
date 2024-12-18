class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[256];
        // Array.fill(count, 0);
        int start = 0, result = 0;

        for (int end = 0; end < s.length(); end++) {
            count[s.charAt(end)]++;
            while (count[s.charAt(end)] > 1) {
                count[s.charAt(start)]--;
                start++;
            } 
            result = Math.max(result, end - start + 1);
        }
        return result;
    }
}