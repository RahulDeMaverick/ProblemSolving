class Solution {

 HashMap<Integer, Integer> map;
 int count;
 List<Long> li;
 public int confusingNumberII(int n) {
     map = new HashMap<>();
     li = new ArrayList();
      if(n == 0)  return 0;
    map.put(0,0); map.put(1,1); map.put(6,9); map.put(8,8); map.put(9,6);
     dfs(0, n);
    // System.out.print(li);
     return count;
    }
    
    private void dfs(long currNum,int n){
        
        //base case
        if(currNum > n) return;
        
        if(isConfusing(currNum)){
            li.add(currNum);
            count++;
         }
        //logic
        for(int dig: map.keySet()){  
            long newNum = currNum * 10 +dig;
            if (newNum != 0 ) 
                dfs(newNum,n);
        }
    }
    
    private boolean isConfusing(long newNum){
        long temp = newNum;
        long result = 0;
        while(temp > 0){
            int lastDigit = (int)temp%10;
            result = result * 10 + map.get(lastDigit);
            temp = temp/10;
        }
        if(newNum != result){
        return true;
        }
        return false;
    }
}