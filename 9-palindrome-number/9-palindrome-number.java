class Solution {
    public boolean isPalindrome(int x) {
        int n;
        int sum=0;
        int r;
        n = x;
        while(n>0){
            r = n%10;
            sum=(sum*10)+r;
            n=n/10;
            
        }
        if(x == sum || x == sum / 10){
            return true;
        }else{
            return false;
        }
    }
    }
