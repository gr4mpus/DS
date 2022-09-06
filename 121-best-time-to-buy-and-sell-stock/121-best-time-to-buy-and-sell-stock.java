class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minSoFar = Integer.MAX_VALUE;
        for(int i = 0; i<prices.length; i++) {
            if(prices[i] < minSoFar) {
                minSoFar = prices[i];
            } else {
                int priceDifference = prices[i] - minSoFar;
                if(priceDifference > maxProfit) {
                    maxProfit = priceDifference;
                }
            }
        }
        return maxProfit;
    }
}