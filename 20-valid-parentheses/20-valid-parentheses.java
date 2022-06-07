class Solution {
    public boolean isValid(String s) {
        
        Map<Character,Character> map = new HashMap<>();
        
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
   
            if(map.containsKey(ch)){
              if(stack.empty() || stack.pop()!=map.get(ch))
                    return false;
            }
                else
                    stack.push(ch);
                
                    
            
            
        }
   
        return stack.empty();
    }
}