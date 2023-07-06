class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return 1;
        int rem =n;
        int res =0;
        for(int i=1;i<=rem;i++){
             rem = rem-i;
             if(rem >= 0){
                res++;
            }
        }
        return res;
    }
}