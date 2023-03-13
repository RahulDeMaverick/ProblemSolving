class Solution {
    public int findJudge(int n, int[][] trust) {
        //draw the graph to understand the problem
        //create a indegrees array
        //iterate over trust 2d array
        
        
        int[] indegrees = new int[n];
        //indegrees array is count of no of in direction and out direction in a graph
        
        for(int[] in: trust){
            //if a person gives support to other then we should reduce is indegree array
            indegrees[in[0]-1]--;
            //if a person is getting a support then increases is count by one
            indegrees[in[1]-1]++;
        }
        //iterate over the indegrees if any of the values is equal to n-1 then return 
        for(int i =0;i< n;i++){
            if(indegrees[i] ==n-1) return i+1;
        }
        return -1;
    }
}