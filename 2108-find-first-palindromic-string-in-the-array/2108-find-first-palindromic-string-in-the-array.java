class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
             String res = sb.reverse().toString();
            if( words[i].equals(res)){
                 return words[i];  
            }   
             
              } 
                
                return "";
    }
}