class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        /*
        Assume a imaginary array and calculate column index and row index and do binary search in the imaginary array. always do row index and column index on column. that is n
        */
        
        if(matrix == null || matrix.length == 0) return false;
        int m= matrix.length; int n = matrix[0].length;
        int low = 0; int high = m*n-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            int nr= mid/n;
            int nc= mid%n;
            if(matrix[nr][nc] == target) return true;
            else if(matrix[nr][nc]>target) high = mid -1;
            else low = mid+1;
            
        }
        return false;
        
    }
}