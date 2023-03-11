class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        //create a result arraylist
    
        List<int []> result = new ArrayList<>();
        
        //iterate over the intervals
        
        for(int[] in: intervals){
            //new interval is greater than the existing interval
            if(in[1] < newInterval[0]){
                result.add(in);
                //new interval is lesser than existing interval
            }else if(in[0] > newInterval[1]){
                result.add(newInterval);
                newInterval = in;
                //overlapping case
                //take the minimum between both the start intervals
            } else{
                newInterval[0] = Math.min(in[0],newInterval[0]);
                //take the maximum between both the end intervals

                newInterval[1] = Math.max(in[1],newInterval[1]);
            }
            
            
        }
        
        //add the new interval to the list
        result.add(newInterval);
        //return the result array by converting to int array
        return result.toArray(new int[result.size()][0]);
        
        
    }
}