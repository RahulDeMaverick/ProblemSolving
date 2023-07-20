class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s: sentences){
            int strArr = s.split("\\s+").length;
            max = Math.max(max,strArr);
        }
        return max;
    }
}