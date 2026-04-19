class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;

        int i = 0, j = 1;

        while( j < prices.length ) {
            int diff = prices[j] - prices[i];

            if(diff < 0){
                i = j;
            }
            j++;
            profit = Math.max(diff, profit);

        }
        return profit;
    }
}
