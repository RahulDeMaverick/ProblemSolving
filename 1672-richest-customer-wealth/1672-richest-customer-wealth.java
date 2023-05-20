class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int m = accounts.length;
        int n = accounts[0].length;
        int max =0;
        
        for(int i =0;i<m;i++){
            int count =0;
            for(int j =0;j<n;j++){
                count += accounts[i][j];
            }
            max = Math.max(max,count);
        }
        return max;
    }
}