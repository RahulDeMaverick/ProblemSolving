class Solution {
    public int[] sortArrayByParity(int[] nums) {
       List<Integer> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] %2 ==0)
                res.add(nums[i]);
        }
         for(int i=0;i<nums.length;i++){
            if(nums[i] %2 !=0)
                res.add(nums[i]);
        }
        
        return res.stream().mapToInt(i -> i).toArray();
    }
}