class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder();
        

        for(char c : s.toCharArray()){
        if (Character.isLetterOrDigit(c)) {
        sb.append(c);        
}
        }
        String s1 = sb.toString();
        System.out.print(s1);
        String s2 = sb.reverse().toString();
        return s1.equalsIgnoreCase(s2);
        
    }
}