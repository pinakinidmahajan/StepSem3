class Solution {
    public int secondHighest(int[] scores) {
        int highest = -1;
        int second = -1;
        for (int score : scores) {
            if (score > highest) {
                second = highest;
                highest = score;
            } else if (score > second && score < highest) {
                second = score;
            }
        }
        return second;
    }
}