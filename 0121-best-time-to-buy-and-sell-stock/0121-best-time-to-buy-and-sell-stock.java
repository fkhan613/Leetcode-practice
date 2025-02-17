class Solution {
    public int maxProfit(int[] prices) {


        if(prices == null || prices.length < 2){
            return 0;
        }


        int buyPrice = prices[0];
        int profit = 0;

        for(int i = 0; i < prices.length; i++){

            if(prices[i] < buyPrice){
                buyPrice = prices[i];

            } else if((prices[i] - buyPrice) > profit){
                profit = prices[i] - buyPrice;
            }
        }

        return profit;
    }
}