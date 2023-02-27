class Solution {
    public int singleNumber(int[] nums) {
        
        //create frequecy map
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums)
          {
            map.put(i, map.getOrDefault(i,0)+1);

        }
        
        //if map.get(i) returns only one then return
          for(int i :nums){
              if(map.get(i) ==1)
              {
                  return i;
              }
}            
         return 0;
        }

}