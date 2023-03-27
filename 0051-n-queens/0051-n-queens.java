class Solution {
    
    List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        if(n==0) return result;
        boolean[][] board = new boolean[n][n];
        helper(board,0,n);
        return result;
        
    }
    
    private void helper(boolean[][] board,int r,int n){
        //base
        if(r==n){
            List<String> list = new ArrayList<String>();
          
            for(int i=0;i<n;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    if(board[i][j]){
                        sb.append('Q');
                    }else{
                        sb.append('.');
                    }
                }
                  list.add(sb.toString());
            }
            result.add(list);
            return;
        }
        
        //logic
        for(int j=0;j<n;j++){
            if(isSafe(board,r,j,n))
            {                      
            //action
                board[r][j] = true;

            //recurse
                helper(board,r+1,n);
                
            //backtrack
                board[r][j] = false;
            }
        }
    }
    
    private boolean isSafe(boolean[][] board,int r,int c, int n){
        //top
        for(int i=0;i<r;i++){
            if(board[i][c]) return false;   
        }
        
        int i =r; int j =c;
        
        //top left
        while(i>=0 && j>=0){
            if(board[i][j]){return false;}
            i--;
            j--;
        }
        //top right
        i=r; j=c;
        
        while(i>=0 && j<n){
            if(board[i][j]){return false;}
            i--;
            j++;
        }
        return true;
    }
}