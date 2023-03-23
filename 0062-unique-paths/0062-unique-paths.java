//TC: O(M*N)
//SC: O(M*N)
class Solution {
    //memoraization technique
    //call recurssively and save it in to memo array (in a data struture) 
    //top down dp is nothing calling the recursion but saving the recursion in to a data structure to memorize it and we can use them
    int [][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        return helper(0,0,m,n);  
    }
    
    private int helper(int i, int j, int m, int n){
        //base
        
        if(i==m || j==n) return 0;
        if(i==m-1 && j==n-1) return 1;
        
        
        //logic
        //case 1 is moving right and case 2 is moving down.
        int case1=0;
        if(i<m-1){
            //if i+1 j array is zero then go and calculate else if already calculated use it
            if(memo[i+1][j] ==0)
            {
             memo[i+1][j]  = helper( i+1,  j,  m,  n);
            }
            case1=memo[i+1][j];
        }

        int case2=0;
        if(j<n-1){
            if(memo[i][j+1] ==0)
            {
             memo[i][j+1]  = helper( i,  j+1,  m,  n);
            }
            case2=memo[i][j+1];
        }
            
            return case1+case2;
    }
}