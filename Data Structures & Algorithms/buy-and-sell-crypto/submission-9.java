class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;

        int low = 0;

        for(int i = 1 ; i < prices.length ; i++){
            int diff = prices[i] - prices[low];
            profit = Math.max(profit, diff);
            if(diff < 0){
                low = i;
            }
        }

        // while( j < prices.length ) {
        //     int diff = prices[j] - prices[i];

        //     if(diff < 0){
        //         i = j;
        //     }
        //     j++;
        //     profit = Math.max(diff, profit);

        // }
        return profit;
    }
}
