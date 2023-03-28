class Solution {
    
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        if(nums ==null || nums.length ==0) return result;
        //01 recurstion
       // helper(nums,0,new ArrayList<>()); 
         backtrack(nums,0,new ArrayList<>());
        return result;
    }
 /*   
    private void helper(int[] nums,int i,List<Integer> path){
        //base
        if(i==nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        
        //logic
        
        //dont choose
        helper(nums,i+1,path);
        
        //choose
        //action
        path.add(nums[i]);
        helper(nums,i+1,path); //recurse
        
        //backtrack
        path.remove(path.size()-1);
    }
    */
    
    private void backtrack(int[] nums,int idx,List<Integer> path){
        
        result.add(new ArrayList<>(path));        
        for(int i =idx;i<nums.length;i++){
            //action
            path.add(nums[i]);
            //recurse
            backtrack(nums,i+1,path);
            //backtrack
            path.remove(path.size()-1);
        }
    }
}