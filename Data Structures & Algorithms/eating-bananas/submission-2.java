class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int l = 1, r = 0;

        for(int i : piles){
            r = Math.max(r, i);
        }
        int k = r;
        while(l <= r){
            int m = l + (r - l)/2;
            int time = 0;
            for(int p : piles){
                time += Math.ceil((double)p/m);
                // if(p % m > 0) time++;
            }

            if(time > h ){
                l = m + 1;
            } else {
                k = Math.min(k, m);
                r = m - 1;
            }
        }

        return k;
    }
}
