class Solution {
    public int arrangeCoins(int rem) {
        if(rem==1) return 1;
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