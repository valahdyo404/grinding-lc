class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bot = matrix.length -1;

        while (top <= bot) {
            int row = (top + bot) / 2;
            if (matrix[row][0] < target && target < matrix[row][matrix[row].length - 1]) break;
            else if (matrix[row][0] > target) bot = row -1;
            else top = row + 1;
        }

        // if (top > bot) return false;
        int row = (top + bot) / 2;
        int l = 0;
        int r = matrix[row].length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (target == matrix[row][m]) return true;
            if (target > matrix[row][m]) l = m + 1;
            else r = m - 1;
        }
        return false;
    }
}