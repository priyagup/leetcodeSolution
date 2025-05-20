class Solution {
    public int maxProfit(int[] prices) {
        int profit=0; 

       for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
       }
        return profit;

      /* Why Greedy Works Here:Time Complexity O(n) & Space O(1)
        We take all the small profits (local optima). 
        That adds up to the global optimum, because the problem allows unlimited transactions.*/
    }
}