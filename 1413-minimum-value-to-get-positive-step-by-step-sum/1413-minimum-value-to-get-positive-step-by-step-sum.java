class Solution {
    public int minStartValue(int[] nums) {
        
        int min=Integer.MAX_VALUE;
    int sum=0;
    for(int i:nums){
        sum+=i;
        min=Math.min(min,sum);
    }
    if(min<0)return -min+1;
    return 1;
        
    }
}