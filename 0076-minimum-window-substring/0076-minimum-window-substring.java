class Solution {
    public String minWindow(String s, String t) {
       int[] map = new int[128];
       int count = t.length();
       int start = 0, end = 0, startIndex = 0, minLength = Integer.MAX_VALUE;
            
       for (char c: t.toCharArray()){
            map[c]++;
       }
       char[] charS = s.toCharArray();

       while (end < charS.length) {
            if (map[charS[end++]]-- > 0) {
                count--;
            }
            while (count == 0) {
                if (end - start < minLength) {
                    startIndex = start;
                    minLength = end - start;
                }
                if (map[charS[start++]]++ == 0) {
                    count++;
                }
            }
        }
       return minLength == Integer.MAX_VALUE ? new String() : new String(charS, startIndex, minLength);
    }
}