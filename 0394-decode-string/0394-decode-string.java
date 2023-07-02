class Solution {
    public String decodeString(String s) {
        //strSt to keep strack of character
        Stack<StringBuilder> strSt = new Stack<>();
        //numSt to keep track of digit
        Stack<Integer> numSt = new Stack<>();
        //curr String
        StringBuilder currStr = new StringBuilder();
        //currNum 
        int currNum = 0;
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            //if char is number calculate currNum
            if(Character.isDigit(c)){
                currNum = currNum * 10 + c - '0'; 
            }
            //if open bracket then push curr num to numSt and currStr to strSt and make them zero and empty
            else if(c == '['){
                numSt.push(currNum);
                strSt.push(currStr);
                currStr = new StringBuilder();
                currNum =0;          
            }
            //if its closed brackt then we can decode string 
            //pop out numSt to repeat the currStr
            // iterate over till poped  element to append the curr string
            //pop the strSt and append the iterated value.
            // ever time we encounter close bracket we decode the nested bracket and append the character before it 
            else if(c == ']'){
                StringBuilder sb = new StringBuilder();
                int times = numSt.pop();
                for(int k=0;k<times;k++){
                    sb.append(currStr);
                }
                currStr= strSt.pop().append(sb);
                
            }
            //if its character just append to currString
            else{
                currStr.append(c);
            }
        }
        return currStr.toString();
    }
}