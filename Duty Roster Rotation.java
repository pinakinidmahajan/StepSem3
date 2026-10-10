class Solution {
    public String[] rotateRoster(String[] names, int k) {
        int n = names.length;
        k = k % n;
        String[] result = new String[n];
        for (int i = 0; i < n; i++) {
            result[(i + k) % n] = names[i];
        }
        return result;
    }
}