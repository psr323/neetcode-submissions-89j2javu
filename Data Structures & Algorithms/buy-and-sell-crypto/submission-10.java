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
        return profit;
    }
}
