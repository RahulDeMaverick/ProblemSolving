class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int overAllSum = nums[0];
        for(int i = 1; i < nums.length; i++) {
             if(currentSum >= 0) {
                 currentSum += nums[i];
             } else {
                 currentSum = nums[i];
             }
             if(currentSum > overAllSum) {
                 overAllSum = currentSum;
             }
        }
        return overAllSum;
    }
}