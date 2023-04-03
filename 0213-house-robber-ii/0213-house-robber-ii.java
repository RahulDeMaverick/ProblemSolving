class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        // Since it's a loop, both first and second house
        // can't be robbed together. Apply Dp House Robber1 algo to it. 
        return Math.max(HouseRobber1(nums, 0, nums.length-1), HouseRobber1(nums, 1, nums.length));  
    }
    
    private int HouseRobber1(int [] nums, int start, int end)
    {
        int robfirst = 0, robnext = 0;
        
        for(int i = start; i< end; i++)
        {
            int temp = Math.max(nums[i] + robfirst, robnext);
            robfirst = robnext;
            robnext = temp;
        }
        return robnext;
    }
        
    
}