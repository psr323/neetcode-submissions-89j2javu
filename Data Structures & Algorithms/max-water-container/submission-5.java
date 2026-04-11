class Solution {
    public int maxArea(int[] heights) {
        
        int i = 0, j = heights.length - 1;

        int result = 0;

        while(i < j){
            int w = Math.min(heights[i], heights[j]) * (j - i);
            result = Math.max(result, w);

            if(heights[i] < heights[j]){
                i++;
            } else {
                j--;
            }
        }

        return result;
    }
}
