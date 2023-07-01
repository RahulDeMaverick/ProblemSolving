class Solution {
    public boolean winnerOfGame(String s) {
        int bobCount =0;
        int aliceCount =0;

        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i-1) =='A' && s.charAt(i+1) =='A' && s.charAt(i) =='A' ) aliceCount++;
            if(s.charAt(i-1) =='B' && s.charAt(i+1) =='B'  && s.charAt(i) =='B'  ) bobCount++;
            
        }
        System.out.println(aliceCount);
        System.out.println(bobCount);
        
        if(aliceCount > bobCount) return true;
        return false;
        
    }
}