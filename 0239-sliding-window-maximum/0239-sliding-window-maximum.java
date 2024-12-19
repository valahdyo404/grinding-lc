class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList();
        Deque<Integer> arrDeque = new ArrayDeque();

        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            while (!arrDeque.isEmpty() && nums[end] > nums[arrDeque.peekLast()]) {
                arrDeque.removeLast();
            }
            arrDeque.add(end);
   
            if (start > arrDeque.peek()) {
                arrDeque.remove();
            }

            if (end - start + 1 >= k) {
                result.add(nums[arrDeque.peek()]);
                start++;
            }
        }
        return result.stream().mapToInt(i->i).toArray(); 
    }
}