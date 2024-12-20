class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        int count = t.length();
        int start = 0, minLength = Integer.MAX_VALUE, startIndex = 0;

        for (char c: t.toCharArray()) {
            map[c]++;
        }

        char[] charS = s.toCharArray();
        for (int end = 0; end < charS.length; end++) {
            if (map[charS[end]] > 0) {
                count--;
            }
            map[charS[end]]--;
            while (count == 0) {
                if (end - start < minLength) {
                    startIndex = start;
                    minLength = end - start;
                }

                if (map[charS[start]] == 0) {
                    count++;
                }
                map[charS[start]]++;
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? new String() : new String(charS, startIndex, minLength+1); 
    }
}