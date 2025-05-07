class Solution {
    public int maxProfit(int[] prices) {
        int min_price_so_far = Integer.MAX_VALUE;
        int max_profit =0;

        for(int i=0; i<prices.length; i++){
          
            if(prices[i]< min_price_so_far){
                min_price_so_far = prices[i];
            }
            if(prices[i] - min_price_so_far > max_profit){
                max_profit = prices[i] - min_price_so_far ;
            }
        }
        return max_profit;
    }
}