class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        
        int total=0;
        while (numBottles >= numExchange) {

            int count = numBottles / numExchange;

            total += numExchange * count;
            numBottles -= numExchange * count;

            numBottles += count;
        }
        
        return total+numBottles;
        
    }
}