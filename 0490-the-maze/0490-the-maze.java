class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        //if start is equal to destination then return true
        if(start[0] == destination[0] && start[1] == destination[1]) return true;
        
        int m = maze.length;
        int n = maze[0].length;
        // queue to process the connected componenets 
        Queue<Integer> q = new LinkedList<>();
        // directions array
        int[][] dirs = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        //adding start to the queue
        q.add(start[0]);
        q.add(start[1]);
        //chage the start element to 2
        maze[start[0]] [start[1]] = 2;
            //iterate till q is empty
            while(!q.isEmpty()){
                //polling row and column
                int r = q.poll();
                int c = q.poll();
                //iterate over dirs array
                for(int[] dir : dirs){
                    // having i and j with row and column
                    int i =r; int j=c;
                    // iterate over the maze till we reach the boundary or the wall (1)
                    while(i>=0 && i<m && j>=0 && j<n && maze[i][j] !=1){
                        //increment the i and j for directions 
                        i += dir[0];
                        j += dir[1];
                    }
                    //since the ball reaches the end that is 1 we need to decrement the i and j 
                    i -= dir[0];
                    j-= dir[1];
                    //if the maze is not reached already
                    if(maze[i][j] !=2){
                        // if the i and j reaches the destination return true;
                        if(i == destination[0] && j == destination[1]) return true;
                        //adding the i and j to the q
                        q.add(i); q.add(j);
                        //change the index as marked
                        maze[i][j] = 2;
                    }
                }
            }
        //if the result is not true and reached then return false
        return false;
    }
}