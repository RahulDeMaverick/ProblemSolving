class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
    
        List<int []> result = new ArrayList<>();
        
        for(int[] in: intervals){
            if(in[1] < newInterval[0]){
                result.add(in);
            }else if(in[0] > newInterval[1]){
                result.add(newInterval);
                newInterval = in;
            } else{
                newInterval[0] = Math.min(in[0],newInterval[0]);
                newInterval[1] = Math.max(in[1],newInterval[1]);
            }
            
            
        }
        result.add(newInterval);
        
        return result.toArray(new int[result.size()][0]);
        
        
    }
}