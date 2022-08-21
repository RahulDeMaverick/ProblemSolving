class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {   
        if(matrix==null || matrix.length==0) return false;
          boolean flag = false;
        for(int i=0;i<matrix.length;i++){

            flag = binary(matrix[i],target);
            if(flag == true)
            break; 
        }
        return flag;
    }
    
    private boolean binary(int[] nums,int target){
         int start = 0;
            int end = nums.length-1;
            
            while(start <= end ){
                int mid = (start+end)/2;

                if (nums[mid] == target){
                    return true;
                }
                else if (nums[mid] < target) {
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            return false;
    }
}