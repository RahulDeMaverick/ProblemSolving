class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        int[][] copy = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(image[i][j] == 0)
{                image[i][j]= 1;
                copy[i][m-j-1] = image[i][j];}else{
                    image[i][j]= 0;
                copy[i][m-j-1] = image[i][j];
                }
   
            }
        }
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(copy[i][j] == 0)
        //             copy[i][j]= 1;
        //         else
        //             copy[i][j]= 0;
        //     }
        // }
        return copy;
    }
}