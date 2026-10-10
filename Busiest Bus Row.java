class Solution {
    public String busiestRow(int[][] grid) {
        int bestRow = 0;
        int maxTotal = -1;
        for (int i = 0; i < grid.length; i++) {
            int currentTotal = 0;
            for (int j = 0; j < grid[i].length; j++) {
                currentTotal += grid[i][j];
            }
            if (currentTotal > maxTotal) {
                maxTotal = currentTotal;
                bestRow = i;
            }
        }
        return "Row " + bestRow + ", Total " + maxTotal;
    }
}