class Solution {
    public int countInBand(int[] scores, int low, int high) {
        int left = findFirstGreaterOrEqual(scores, low);
        if (left == -1) return 0;
        int right = findFirstGreater(scores, high);
        if (right == -1) return scores.length - left;
        return right - left;
    }
    
    private int findFirstGreaterOrEqual(int[] arr, int target) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
    
    private int findFirstGreater(int[] arr, int target) {
        int low = 0, high = arr.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res;
    }
}