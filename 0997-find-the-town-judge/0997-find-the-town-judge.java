class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int[] indegrees = new int[n];
        
        for(int[] in: trust){
            indegrees[in[0]-1]--;
            indegrees[in[1]-1]++;
        }
        for(int i =0;i< n;i++){
            if(indegrees[i] ==n-1) return i+1;
        }
        return -1;
    }
}