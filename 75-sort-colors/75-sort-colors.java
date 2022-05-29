class Solution {
    public void sortColors(int[] nums) {
       int result[] = new int[nums.length];
        result = mergeSort(nums);
       for(int i=0;i<result.length;i++){
            nums[i] = result[i];
        }
  
    }
    
    private int []   mergeSort(int[] nums){
        
        if(nums.length<= 1){
            return nums;
        }
        
        int midpoint = nums.length/2;
        int left[] = new int[midpoint] ;
        int right[] = new int[nums.length-midpoint];
        
        for(int i=0;i<midpoint;i++){
            left[i] = nums[i];
        }
          for(int j=0;j<right.length;j++){
            right[j] = nums[midpoint+j];
        }
        int result [] = new int[nums.length];
        left = mergeSort(left);
        right = mergeSort(right);
        
      result = merge(left,right);
       
       return result;
       
        
    }
     
    private int[]  merge(int[] left,int[] right){
        
         int result[] = new int[left.length+ right.length];
        
        int leftpointer=0;
        int rightpointer=0;
        int resultpointer=0;
        
        while(leftpointer < left.length || rightpointer <right.length ){
            
            if(leftpointer < left.length && rightpointer <right.length ){
                if(left[leftpointer]< right[rightpointer]){
                    result[resultpointer++] = left[leftpointer++];
                }else{
                    result[resultpointer++] = right[rightpointer++];
                }            
        }
            else if(leftpointer < left.length){
                  result[resultpointer++] = left[leftpointer++];
            }
        
            else if(rightpointer <right.length){
                result[resultpointer++] = right[rightpointer++];
            }
    }
         return result;
         
}
}