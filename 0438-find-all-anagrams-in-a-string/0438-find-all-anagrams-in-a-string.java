class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (p.length() > s.length()) {
            return ans;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        for (var i = 0; i < p.length(); i++) {
          pCount[p.charAt(i) - 'a']++;
          sCount[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(pCount, sCount)) ans.add(0);

        int l = 0;
        int r = p.length();

        while (r < s.length()) {
          sCount[s.charAt(l) - 'a']--;
          sCount[s.charAt(r) - 'a']++;
          l++;
          r++;
          if (Arrays.equals(pCount, sCount)) ans.add(l);
        }
       
      return ans;
    }
}
