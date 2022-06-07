class Solution {
    public int maxProfit(int[] prices) {
     
        int buy=0,profit =0, sell=1;
       
        for(int i=1;i<prices.length;i++){
            
            profit = Math.max(profit,prices[sell]-prices[buy]);
                
                if(prices[sell]< prices[buy]){
                    buy =sell;
                }
            sell++;
        }
        return profit;
    }
}