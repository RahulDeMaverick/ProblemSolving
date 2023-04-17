class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean flag = false;
        for(int i =0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                int temp = map.get(nums[i]);
                if(Math.abs(temp-i) <= k){
                   flag = true; 
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        return flag;
    }
}