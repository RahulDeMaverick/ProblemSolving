class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int runningSum =0;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==0)
                runningSum--;
            else
                runningSum++;
            
            if(map.containsKey(runningSum))
                 count = Math.max(count,i-map.get(runningSum));
            else
                map.put(runningSum,i);
        }
        return count;
    }
}