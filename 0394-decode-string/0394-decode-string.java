class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> strSt = new Stack<>();
        Stack<Integer> numSt = new Stack<>();
        StringBuilder currStr = new StringBuilder();
        int currNum = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                currNum = currNum * 10 + c - '0';          
            }else if(c == '['){
                numSt.push(currNum);
                strSt.push(currStr);
                currStr = new StringBuilder();
                currNum =0;          
            }else if(c == ']'){
                StringBuilder sb = new StringBuilder();
                int times = numSt.pop();
                for(int k=0;k<times;k++){
                    sb.append(currStr);
                }
                currStr= strSt.pop().append(sb);
                
            }else{
                currStr.append(c);
            }
        }
        return currStr.toString();
    }
}