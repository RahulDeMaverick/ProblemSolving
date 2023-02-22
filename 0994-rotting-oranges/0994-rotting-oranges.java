class Solution {
    public int orangesRotting(int[][] grid) {
        
        if(grid == null || grid.length == 0) return 0;
        int m = grid.length;
        int n = grid[0].length;
        
        Queue<int[] > q = new LinkedList<>();
        int fresh =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] ==2){
                    q.add(new int[] {i,j});
                }
                if(grid[i][j] == 1) fresh++;
             }
        
        }
        int time =0;
        if(fresh == 0) return 0;
        int[][] dirs = new int[][] {{-1,0},{0,-1},{1,0},{0,1}};
                while(!q.isEmpty()){
                    int size = q.size();
                    for(int i=0;i<size;i++){
                        int [] curr = q.poll();
                        for(int[] dir: dirs){
                            int r = dir[0] + curr[0];
                            int c = dir[1] + curr[1];
                            if(r >= 0 && r<m && c>=0 && c<n && grid[r][c]==1){
                                grid[r][c] = 2;
                                fresh--;
                                if(fresh == 0) return time+1;
                                q.add(new int []{r,c});
                            }
                        }
                        
                    }
                    time++;
                }
                
                return -1;
} 
}