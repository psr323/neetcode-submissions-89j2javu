class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0, h = heights.length - 1;
        int w = 0;
        while(l < h){

            int q = Math.min(heights[l], heights[h]) * (h - l);

            if(w < q){
                w = q;
            }

            if(heights[l] < heights[h]){
                l++;
            } else {
                h--;
            }
        }

        return w;
    }
}
