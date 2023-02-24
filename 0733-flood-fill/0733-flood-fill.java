class Solution {
    
    //BFS solution
    // start from the root node and process each node check the color now and change the color
// use the dirs array to go over the 4 dirs
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        
        if(image == null || image.length == 0 ) return image;
        int m = image.length; 
        int n = image[0].length;
        // if the new color is already present in the image then just return the image
        if(image[sr][sc] == newColor) return image;
        Queue<Integer> q = new LinkedList<>();
        //add row index and column index to the queue
        q.add(sr);
        q.add(sc);
        //saving the existing color of the root node to compare with other nodes
        int color = image[sr][sc];
        //change the root node to newcolor
        image[sr][sc] = newColor;
        int[][] dirs = new int [][] {{0,1},{0,-1},{-1,0},{1,0}};
        
        while(!q.isEmpty()){
            //poll the sr and sc
            int r = q.poll();
            int c = q.poll();
            
            for(int [] dir : dirs){
                //iterate over the directions array and get row index and column index
                int nr = r + dir[0];
                int nc = c + dir[1];
                //boundary coundition check and check if the new node is equal to old color
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && image[nr][nc] == color){
                    //add to queue and change the color
                    q.add(nr);
                    q.add(nc);
                    image[nr][nc] = newColor;
                }
            }
            
        }
        //lastly return the image the queue will take care of all the nodes
      return image;  
        
    }
}
