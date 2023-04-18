class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        result = new ArrayList<>();
        List<Integer> path = new ArrayList<Integer>();
        if(candidates == null) return result;
        helper(candidates, 0 ,target, path);
        return result;
        
    }
    
    private void helper(int[] candidates,int pivot,int amount,List<Integer> path){
        if(amount < 0) return;
        //base
        if(amount == 0) {
        result.add(new ArrayList<>(path));
        return;
        }
  
      for(int i = pivot ;i<candidates.length;i++){
          
          if (i > pivot && candidates[i] == candidates[i-1]) continue;
          //action
          path.add(path.size(),candidates[i]);
          
          //recurse
          helper(candidates, i+1 ,amount - candidates[i], path);
         
          //backtrack
          path.remove(path.size()-1);
      }
    }
}