class Solution {
    //dp top down memorization solution
    public int numDecodings(String s) {
        //dp array to be declared with len of string +1
        int[] dp = new int[s.length()+1];
        //dp[0] is always 1 its dummy empty string
        dp[0] =1;
        //dp is decided by s.charAt(o) if first char is 0 then dp[1] is 0 else dp[1] is 1
        dp[1] = s.charAt(0) =='0' ? 0:1 ;
        //start i at 2
        for(int i=2;i<s.length()+1;i++){      
            //if s.char(i-1) != 0 then do the step
            if(s.charAt(i-1) != '0'){
                dp[i] += dp[i-1];
            }
            //dp(s.charat(i-1) is 1 or2 and s.char i-1 is less than 7 then do the following)
            if(s.charAt(i-2) == '1' || (s.charAt(i-2) =='2' && s.charAt(i - 1) < '7')){
                dp[i] += dp[i-2];
            }      
        }
        // return last value in dp array
        return dp[s.length()];
    }
    
}

 /*
 public int numDecodings(String s) {
        int count=0;
         HashMap<Integer,Character> map = new HashMap<>();
        for (int i = 1; i <= 26; i++) {
            char ch = (char) ('A' + i - 1); 
            map.put(i, ch);
        }
        int slow=1;
        
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            int val1 = Character.getNumericValue(c1);
            if(map.containsKey(val1)){
                if(slow<s.length() && s.charAt(slow) != '0')
                    count++;
                if(slow==s.length()) count++;
            }
            if(slow<s.length()){
            char c2 = s.charAt(slow);
            if(val1 == 0) break;
            int val2 = Character.getNumericValue(c2);
            int val3 = val1*10 +val2;
                if(map.containsKey(val3)){
                    count++;
                }
                i++;
            }      
            slow++;
        }
        return count;
    }
*/