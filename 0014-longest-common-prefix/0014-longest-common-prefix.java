class Solution {
    public String longestCommonPrefix(String[] strs) {
     if (strs == null || strs.length == 0) {
        return "";
    }
    
    // Find the minimum length of all strings in the array
    int min_length = Integer.MAX_VALUE;
    for (String s : strs) {
        min_length = Math.min(min_length, s.length());
    }
    
    // Iterate over the characters in the first string
    for (int i = 0; i < min_length; i++) {
        // Get the current character to compare
        char c = strs[0].charAt(i);
        
        // Check if all other strings have the same character at this position
        for (int j = 1; j < strs.length; j++) {
            if (strs[j].charAt(i) != c) {
                // If not, return the prefix up to this point
                return strs[0].substring(0, i);
            }
        }
    }
           return strs[0].substring(0, min_length);
    }
}