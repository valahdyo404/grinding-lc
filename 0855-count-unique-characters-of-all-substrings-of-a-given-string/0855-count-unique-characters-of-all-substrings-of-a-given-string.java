class Solution {
    public int uniqueLetterString(String s) {
      Map<Integer, List<Integer>> hashmap = new HashMap<>();

        for (int i = 0; i < 26; i++) {
            hashmap.put(i, new ArrayList<>(Arrays.asList(-1)));
        }

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'A';
            hashmap.get(index).add(i);
        }

        for (int i = 0; i < 26; i++) {
            hashmap.get(i).add(s.length());
        }

        int count = 0;
        for (int i = 0; i < 26; i++) {
            List<Integer> positions = hashmap.get(i);
            for (int j = 1; j < positions.size() - 1; j++) {
                count += (positions.get(j) - positions.get(j - 1)) * (positions.get(j + 1) - positions.get(j));
            }
        }

        return count;
    }
}