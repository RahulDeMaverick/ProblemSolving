class Solution {
    int m;
    int n;
    int[][] dirs; 
    public boolean exist(char[][] board, String word) {
        if(board== null || board.length ==0) return false;

         m = board.length;
         n = board[0].length;

        dirs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        
        //iterate over the board array to find the first character in the target word.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                //if we found the first character then recusively we will check the neighbours
                if(word.charAt(0) == board[i][j]){
                    //if backtrack funtion returns true then we found all the word
                    if(backtrack(board,word,i,j,0)) return true;
                }

            }
        }
        return false;
    }
    
    private boolean backtrack(char[][] board, String word, int i, int j, int idx){
        //base
        //if we index reaches word length then we able to find all the words in the word
        if(idx == word.length()) return true;
        //boundary check 
        if(i<0 || j<0 || i ==m || j==n || board[i][j]=='#') return false;
        
        //logic
        //check if board[i][j] is equal to word charat() then we continue the process
        if(board[i][j] == word.charAt(idx)){
            
            //change the board[i][j] to different character so that we dont calculate the same value when we recursively call
            //action
            board[i][j] = '#';

            //recurse
            //iterate over dirs array and call recusively
            for(int[] dir: dirs){
                int r = i+dir[0];
                int c = j+dir[1];

              if(backtrack(board,word,r,c,idx+1)) return true;
            }
            
            //backtrack
            //backtrack and change the action we made

            board[i][j] = word.charAt(idx);
        }
        return false;
    }
}