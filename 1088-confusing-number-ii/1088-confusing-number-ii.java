class Solution {
    
// the numbers which mirrors to have a different valid numbers are 0,1,6,8,9
    //create a hashmap to store the values and there corresponding mirrors
    //all the confusing number formed between 0 to n is combination of these 5 numbers

 HashMap<Integer, Integer> map;
 int count;
 List<Long> li;
 public int confusingNumberII(int n) {
     map = new HashMap<>();
     li = new ArrayList();
      if(n == 0)  return 0;
    map.put(0,0);
    map.put(1,1);
    map.put(6,9);
    map.put(8,8);
    map.put(9,6);
     //call dfs with 0 and b
     dfs(0, n);
     return count;
    }
    
    private void dfs(long currNum,int n){
        
        //base case
        //when curr num is greater than n then return
        if(currNum > n) return;
        
        //if isConfusing funtion returns true then increment the count by 1
        //and add it to the list just for your reference
        if(isConfusing(currNum)){
            li.add(currNum);
            count++;
         }
        //logic
        //iterate over the keyset to create unique numbers which is combination of confusing numbers numbers
        for(int dig: map.keySet()){  
            //to get new confusing number every time multiply the curr num by 10 and add the digit from keyset
            long newNum = currNum * 10 +dig;
            if (newNum != 0 ) 
                //call dfs recursivly to get new number every time
                dfs(newNum,n);
        }
    }
    
    private boolean isConfusing(long newNum){
        //initate a temp variable and make changes as we going to reverse the number and check if both the reversed number and number are same
        //classic reversal of a number steps
        long temp = newNum;
        long result = 0;
        while(temp > 0){
            //mod 10 to get last digit from a number
            int lastDigit = (int)temp%10;
            //result is result *10 + the values 
            // result is the reversed value
            result = result * 10 + map.get(lastDigit);
            //remove the last digit
            temp = temp/10;
        }
        //if(when the given number is not equal to the result then its a confusing number and return true)
        if(newNum != result) return true;
        return false;
    }
}