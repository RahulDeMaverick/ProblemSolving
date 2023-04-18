class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer sb = new StringBuffer();
        int len1 = word1.length();
        int len2 = word2.length();
        int ptr1 =0;
        int ptr2 =0;
        while(ptr1<len1 || ptr2<len2){
            if(ptr1<len1)
            {
            sb.append(word1.charAt(ptr1));
            ptr1++;
            }
            if(ptr2<len2){
            sb.append(word2.charAt(ptr2));
            ptr2++; 
            }
        }  
        // while(ptr1<len1){
        //     sb.append(word1.charAt(ptr1));
        //     ptr1++;
        // }
        // while(ptr2<len2){
        //     sb.append(word2.charAt(ptr2));
        //     ptr2++;
        // }
        return sb.toString();
    }
}