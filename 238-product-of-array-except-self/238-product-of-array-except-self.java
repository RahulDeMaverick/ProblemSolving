class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n= nums.length;
        if(nums==null || nums.length ==0) return null;
        int[] res = new int[n];
         res[0] = 1;
        //left pass
        int rProduct =1;
        for(int i=1;i<n;i++){
            
            rProduct *=nums[i-1];
            res[i] = rProduct;
        }
        
        //right pass
         rProduct =1;
        for(int i = n-2;i>=0;i--){
            rProduct *= nums[i+1]; 
            res[i] = res[i] *  rProduct; 
        }
        return res;
    }
}