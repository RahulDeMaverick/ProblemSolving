class Solution {
    int[][] dirs;
    int m;
    int n;
    public int numIslands(char[][] grid) {

        if(grid == null || grid.length ==0) return 0;

        int count =0;
         m = grid.length;
         n = grid[0].length;

            for(int i =0; i<m; i++){
                for(int j =0; j<n; j++){
				if (grid[i][j] == '1') {
					count++;
					dfs(grid, i, j);
				}
                }
            }
        return count;
    }

    private void dfs(char[][] grid,int i,int j){

        
        //base case
        if(i<0 || i>=m || j<0 || j>= n || grid[i][j]=='0') return;

        dirs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

        //logic
        grid[i][j] = '0';
        for(int[] dir : dirs){
            int nr = i + dir[0];
			int nc = j + dir[1];
			dfs(grid, nr, nc);
        }

    }
}