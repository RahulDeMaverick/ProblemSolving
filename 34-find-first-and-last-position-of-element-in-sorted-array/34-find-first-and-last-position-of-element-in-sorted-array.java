class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length ==0) return new int[] {-1,-1};
        if(nums[0] > target || nums[nums.length-1] < target) return new int[] {-1,-1};
        int first = firstBinary(nums,target);
        if(first==-1) 
        {
            return new int[] {-1,-1}; 
        }else{
            int second = secondBinary(nums,first,nums.length-1,target);
            if(second != -1)
                return new  int[] {first,second};
            else
                 return new int[] {-1,-1};
        }
        
    }
    
    public int firstBinary(int[] nums,int target){
        
        int low= 0;
        int high= nums.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(nums[mid] == target){
                if(mid==0 || nums[mid]>nums[mid-1]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
        }
            else if(nums[mid] < target)
                low= mid+1;
            else
                high= mid-1;
        }
        return -1;
    }
    
    public int secondBinary(int[] nums,int low,int high,int target){
        while(low<=high){
            int mid= low +(high-low)/2;
            if(nums[mid] == target){
                if(mid == nums.length-1 || nums[mid]<nums[mid+1])
                    return mid;
                else
                    low = mid+1;
            }
            else if(nums[mid] < target){
                low= mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
}