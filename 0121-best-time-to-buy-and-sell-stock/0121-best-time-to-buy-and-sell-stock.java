class Solution {
    public int maxProfit(int[] prices) {
        //max
        int max =0;
        //take first value as min
        int min = prices[0];
        //iterarte from index 1 not from 0
        for(int i=1;i<prices.length;i++){
            //find the minimum prices
            min = Math.min(min,prices[i]); 
            //calculate the max buy comparing earlier ma and prices[i](current price) - min 
            max = Math.max(max,prices[i] -min);
        }
        
        return max;
    }
}