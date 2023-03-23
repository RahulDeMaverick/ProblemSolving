//tc : o(kn)
//sc : o(n)
class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        if(arr == null || arr.length ==0);
        int n = arr.length;
        //initate dp array
        int [] dp = new int[n];
        //dp[0] is arr[0]
        dp[0] = arr[0];
        //iterate over dp array
        for(int i=1;i<n;i++){
            //declare the max value with arr[i] to calculate all the other max values
            int max =arr[i];
            //go over j till less than or equal to k and also check i-j+1 is >=0 to be in bound or else we will get arrayoutofindex
            for(int j=1;j<=k && i-j +1>=0;j++){
                //calculate the max between the earlier max and the running k partition.
                //we dont need to calculate the max in k partition just compare with current element with previous max
                max = Math.max(max,arr[i-j+1]);
                //once we get max just multiply with j
                //eg : if max is 15 then and j is 2 or 3 depening upon the partition just multiply the max with j
                 int currPart = max*j;
                //if i-j is in bound 
                if(i-j >=0)
                    //current part is max *j + dp[i-j]
                    currPart += dp[i-j]; 
                //calculate the max between curr dp[i] and curr partion
                    dp[i] = Math.max(dp[i],currPart);
            }
        }
        //return last element in the Dp array
        return dp[n-1];
    }
}