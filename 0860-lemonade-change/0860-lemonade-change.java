class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0; int ten =0;
        
        for(int n: bills){
            if(n==5) five++;
            if(n==10 ){
               if(five == 0) return false;
                ten++;
                five--;
            } 
            if(n==20){
                if(five > 0 && ten >0){
                    ten--;
                    five--;
                }else if(five >=3)
                    five -=3;
                else
                    return false;
                }
        }
        return true;
    }
}