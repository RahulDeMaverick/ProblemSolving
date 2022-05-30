class Solution {
    public int search(int[] nums, int target) {
    
        int a= 0; int b=nums.length-1;
        int result= binary(nums,a,b,target);  
         return result;
        }
        
       private int binary(int[] nums,int low,int high,int target){         
          
    if (high <low) {
        return -1;
    }
        int mid = low + (high - low) / 2;
        if (target == nums[mid])
            return mid ;
        else if (nums[mid] > target)
            return binary(nums,low,mid-1,target);
        else
            return binary(nums,mid+1,high,target);
    }
 
    
}