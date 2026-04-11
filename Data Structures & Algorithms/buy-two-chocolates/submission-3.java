class Solution {
    public int buyChoco(int[] prices, int money) {
        
        int i = prices[0];
        int j = prices[1];

        for(int y = 2; y < prices.length; y++){
            int p = prices[y];
            if(i > p && i > j){
                i = p;
            } else if(j > p){
                j = p;
            }
        }
        return money >= i + j ? money - i - j: money;
    }
}