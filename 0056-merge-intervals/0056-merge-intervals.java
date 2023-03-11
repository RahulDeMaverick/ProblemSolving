class Solution {
    public int[][] merge(int[][] intervals) {
        
        //First sot the intervals using comparator
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        // initialize int [] array list 
        List<int[]> result = new ArrayList<>();  
        // declare start and end pointers
        int start = intervals[0][0], end = intervals[0][1];
        //iterate over the intervals
        for(int[] i: intervals){
            //if my interval[0] is greatter than end
            //then no overlap
            if(i[0] > end){ //no overlap
                //create a new int array 
            result.add(new int[] {start,end});
            start = i[0];
            end = i[1];
            }
            else{ //overlap
                end = Math.max(end,i[1]);
            }
        }
        result.add(new int[] {start,end});
        return result.toArray(new int[result.size()][0]);
        
    }
}