class Solution {
    public int trap(int[] h) {
        
        int lMax = h[0], rMax = h[h.length - 1], res = 0;
        int low = 0, high = h.length - 1;
        while(low < high){

            if(lMax > rMax){
                high--;
                rMax = Math.max(rMax, h[high]);
                res += rMax - h[high];
            } else {
                low++;
                lMax = Math.max(lMax, h[low]);

                res += lMax - h[low];

            }

        }


        return res;
    }
}
