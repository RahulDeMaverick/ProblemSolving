class Solution {
    List<List<Integer>>  result;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        result = new ArrayList<>();
        if(candidates == null) return result;
        helper(candidates, 0 ,target, new ArrayList<>());
        return result;
    }
    
    private void helper(int[] candidates,int i,int amount,List<Integer> path){
        if(i== candidates.length || amount < 0) return;
        //base
        if(amount == 0) {
        result.add(new ArrayList<>(path));
        return;
        }
  
        //logic
        //not choose:
        helper(candidates,i+1,amount,path);// not chosing increment the index 
        
        //choose
        //action
        path.add(candidates[i]);//adding the path 
        
        //recurse
        helper(candidates,i,amount-candidates[i],path);//  chosing  dont increment the index  as it can have repeated value
        
        //backtrack
        path.remove(path.size()-1); // removing the path
    }
}