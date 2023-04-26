class Solution {
    public int addDigits(int num) {
        while(num>0){
            int n = num%10;
            num /= 10;
            num = n+num;
            if(num<10) break;
        }
        return num;
    }
}