class Solution {
    public boolean isValid(String s) {
        
        //create a map with the closing brackets "}" as key and opening brackets "{" as values
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');     
        Stack<Character> stack = new Stack<Character>();
        //iterate over string
        for(int i=0;i<s.length();i++){
            
            char ch =s.charAt(i);
            //check if the character is present in the map
            // we will check the closing bracket
            if(map.containsKey(ch)){
                //if the stach is empty or st.pop is not equal to map.get then return false
              if(stack.empty() || stack.pop()!=map.get(ch))
                    return false;
            }
            //if the key is not present in the map put it in stack
                else
                    stack.push(ch);     
        }
        //return stack.empty() if any elements in the stack then the paranthesis are not complete
        return stack.empty();
    }
}