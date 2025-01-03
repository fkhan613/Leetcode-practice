class Solution {
    public int maxProfit(int[] prices) {

        if(prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;
        int leftBuy = 0;
        int rightSell = 1;

        while(rightSell < prices.length){

            int currentSellPrice = prices[rightSell];
            int currentBuyPrice = prices[leftBuy];

            if(currentBuyPrice < currentSellPrice){
                int currentProfit = currentSellPrice - currentBuyPrice;
                maxProfit = Math.max(maxProfit, currentProfit);
            } else{

                leftBuy = rightSell;
            }

            rightSell++;
        }

        return maxProfit;
    }
}