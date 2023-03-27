
//TC: O(n!)
//SC: O(n)^2
class Solution {
    //output
    List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        if(n==0) return result;
        //create a n*n boolean array to place queens
        boolean[][] board = new boolean[n][n];
        //recursive call
        helper(board,0,n);
        return result;
        
    }
    
    private void helper(boolean[][] board,int r,int n){
        //base
        if(r==n){
            List<String> list = new ArrayList<String>();
          //converting a boolean array to String like below because  
          /*  ".Q..",
             "...Q",
             "Q...",
             "..Q." */
            for(int i=0;i<n;i++){
                //for every i we create a string to append to the list
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    //if its true then append Q
                    if(board[i][j]){
                        sb.append('Q');
                        //else append "."
                    }else{
                        sb.append('.');
                    }
                }
                //add it to the list
                  list.add(sb.toString());
            }
            //add list to result and reurn
            result.add(list);
            return;
        }
        
        //logic
        for(int j=0;j<n;j++){
            //if safe function to place a queen. everytime before placing a queen we will check
            if(isSafe(board,r,j,n))
            {                      
            //action
                board[r][j] = true;

            //recurse
                //call the recurive call and just increment the row
                helper(board,r+1,n);
                
            //backtrack
                board[r][j] = false;
            }
        }
    }
    
    private boolean isSafe(boolean[][] board,int r,int c, int n){
        //top
        //column remains same just iterate over rows and give solution
        for(int i=0;i<r;i++){
            if(board[i][c]) return false;   
        }
        
        //save your row and column for future operations
        int i =r; int j =c;
        
        //top left
        //for top left decrement the row and decrement the column if its found true then return false
        while(i>=0 && j>=0){
            if(board[i][j]){return false;}
            i--;
            j--;
        }
        //top right
        i=r; j=c;
        //for top right decrement the row and increment the column if its found true then return false

        while(i>=0 && j<n){
            if(board[i][j]){return false;}
            i--;
            j++;
        }
        return true;
    }
}