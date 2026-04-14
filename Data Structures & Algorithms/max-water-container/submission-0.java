class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int h = Math.min(height[i], height[j]);
                int width = j - i;

                int area = h * width;
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}