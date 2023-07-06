class Solution {
    public int maxProduct(int[] nums) {
        if( nums.length ==0) return 0;
        
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];
        for(int i =1;i<nums.length;i++){
            int curr = nums[i];
             int temp_max = Math.max(curr,Math.max(max*curr,min*curr));
            min = Math.min(curr,Math.min(max*curr,min*curr));
            max = temp_max;
            res = Math.max(max,res);
        }

        return res;
    }
}