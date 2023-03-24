class Solution {
    public boolean isHappy(int n) { 
        HashSet<Integer> set = new HashSet<>();
        while(n!=0 && !set.contains(n)){
            set.add(n);
            n = nextVal(n);
        }
      return n==1;
    }
    
    private int nextVal(int n){
        int sum =0;
        while (n > 0) {
            System.out.println(n);
            int a= n % 10;
            n = n / 10;
            sum += a*a;       
          }
        return sum;
    }
}