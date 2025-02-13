class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = l + ((r - l) / 2);
            
            if (m > 0 && arr[m] < arr[m-1]) r = m - 1;
            else if (m < arr.length - 1 && arr[m] < arr[m+1]) l = m + 1;
            else return m;
        }
        return l;
    }
}