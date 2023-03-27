class Solution {
    int m;
    int n;
    int[][] dirs; 
    public boolean exist(char[][] board, String word) {
        if(board== null || board.length ==0) return false;

         m = board.length;
         n = board[0].length;

        dirs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(word.charAt(0) == board[i][j]){
                    if(backtrack(board,word,i,j,0)) return true;
                }

            }
        }
        return false;
    }
    
    private boolean backtrack(char[][] board, String word, int i, int j, int idx){
        //base
        if(idx == word.length()) return true;
        if(i<0 || j<0 || i ==m || j==n || board[i][j]=='#') return false;
        
        //logic
        if(board[i][j] == word.charAt(idx)){

            //action
            board[i][j] = '#';

            //recurse
            for(int[] dir: dirs){
                int r = i+dir[0];
                int c = j+dir[1];

              if(backtrack(board,word,r,c,idx+1)) return true;
            }
            
            //backtrack
            board[i][j] = word.charAt(idx);
        }
        return false;
    }
}