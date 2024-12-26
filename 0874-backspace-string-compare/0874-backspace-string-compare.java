class Solution {
    public boolean backspaceCompare(String s, String t) {
        int backS = 0, i = s.length()-1;
        int backT = 0, j = t.length()-1;

        while (i >= 0 || j >= 0){
            while (i >= 0 && (backS > 0 || s.charAt(i) =='#')) {
                if (s.charAt(i) == '#') backS++;
                else backS--;
                i--;
            }
            char charS = i < 0 ? '$' : s.charAt(i);
            while (j >= 0 && (backT > 0 || t.charAt(j) == '#')) {
                if (t.charAt(j) == '#') backT++;
                else backT--;
                j--;
            }
            char charT = j < 0 ? '$' : t.charAt(j);
            if (charT != charS) return false;
            i--;
            j--;
        }
        return true;
    }
}