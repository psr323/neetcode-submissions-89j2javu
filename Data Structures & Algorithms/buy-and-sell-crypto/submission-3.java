class Solution {
    public int maxProfit(int[] prices) {
        
       int profit = 0;

        int low = 0, high = 1;

        while(high < prices.length){
            int diff = prices[high] - prices[low];

            if(diff < 0){
                low++;
                // high++;
            } else {
                high++;
            }

            profit = Math.max(profit, diff);
        }

        return profit;
    }
}
