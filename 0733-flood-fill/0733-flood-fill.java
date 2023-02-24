class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image == null || image.length == 0 ) return image;
        int m = image.length; 
        int n = image[0].length;
        if(image[sr][sc] == newColor) return image;
        Queue<Integer> q = new LinkedList<>();
        q.add(sr);
        q.add(sc);
        int color = image[sr][sc];
        image[sr][sc] = newColor;
        int[][] dirs = new int [][] {{0,1},{0,-1},{-1,0},{1,0}};
        
        while(!q.isEmpty()){
            int r = q.poll();
            int c = q.poll();
            
            for(int [] dir : dirs){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && image[nr][nc] == color){
                    q.add(nr);
                    q.add(nc);
                    image[nr][nc] = newColor;
                }
            }
            
        }
        
      return image;  
        
    }
}