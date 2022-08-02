class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        
        int m= matrix.length; int n= matrix[0].length;
        List<Integer> result = new ArrayList<>();
        // declare the boudries
        int top =0; int left=0;
        int right = n-1; int bottom = m-1;
        
        //break the loop if top and bottom pointer or left and right pointer crosses each other
        while(top <= bottom && left<=right){
            
            //left to right
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            //increment the top pointer
            top++;
            if(left<=right){
                //top to bottom
                  for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            }
          //decrement right pointer
            right--;
            if(top <= bottom){
                //right to left
                      for(int j=right;j>= left;j--){
                result.add(matrix[bottom][j]);
            }
            }
         //   decrement bottom pointer
            bottom--;
             if(left <= right){
                 //bottom to top
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
             }
            // increment left pointer
            left++;
        }
        return result;
    }
}