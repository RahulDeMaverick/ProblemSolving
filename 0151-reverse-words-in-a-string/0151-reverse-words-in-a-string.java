class Solution {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        StringBuffer sb = new StringBuffer();
        for(int i=str.length-1;i >= 0;i--){
            sb.append(str[i]);
            sb.append(" ");

        }
       while(sb.charAt(sb.length() -1) == ' ')
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}