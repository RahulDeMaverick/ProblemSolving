class Solution {
    /* 
    Firstly find the transpose of the matrix
    transpose means swaping rows to columns
    then reverse the rows
    use two pointer approch to swap the rows
    */
    public void rotate(int[][] matrix) {
        
        int m = matrix.length;
        // since its m*m matrix we dont need to calculated column length
        
        //transpose of a matrix
         //row becomes column and column becomes rows
        for(int i =0;i<m;i++){
            for(int j=i;j<m;j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
           //4 cross 4 matrix example
        for(int i =0;i<m;i++){
            //since we need to swap only till middle it runs through m/2
            for(int j=0;j<m/2;j++){
                int temp = 0;
                temp = matrix[i][j];
                //m =4
                //temp = mat[0][0]
                //matrix[i][m-1-j] = mat[i][4-1-0]
                //j increments
                //matrix[i][m-1-j] = mat[i][4-1-1] and so on
                matrix[i][j] = matrix[i][m-1-j];
                matrix[i][m-1-j]= temp;
            }
        }
    }
}