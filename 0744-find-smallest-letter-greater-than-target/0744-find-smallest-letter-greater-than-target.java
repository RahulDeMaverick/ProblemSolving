class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int asciiValue = (int) target;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<letters.length;i++){
            
            char ch = letters[i];
            int val = (int) ch;
            if(target < val)
                min = Math.min(min,val);
        }
        if(min < 97 || min>122 ) return letters[0];
        return (char) min;
    }
}