//bottom up dp
//TC: O(M*N)
//SC: O(M*N)
//approch: fill the last row and last column in the dp array as 1
//there is only one way it can move its either down or right so fill the last row and last column with 1
//now iterate over n-2/m-2 index of the array and calculate the dp array with adding dp[i+1][j] with dp[i][j+1]
//like wise calculate all the dp array now dp[0][0] will have all the unique paths
class Solution {
    public int uniquePaths(int m, int n) {
        //dp array 
        int[][] dp = new int[m][n];
        //filling last row
        for(int i=0;i<  n;i++){
            dp[m-1][i] = 1;
        }
        //filling last column with 1
        for(int i=0;i< m;i++){
            dp[i][n-1] = 1;
        }
        //filling up dp array
        for(int i=m-2;i>=0;i--){
            for(int j =n-2;j>=0;j--){
                dp[i][j] = dp[i+1][j]+ dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}

/* 
Top down dp with memorization approch
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
*/