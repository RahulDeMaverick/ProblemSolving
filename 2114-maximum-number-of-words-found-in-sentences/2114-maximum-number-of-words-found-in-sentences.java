class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s: sentences){
            String[] strArr = s.split("\\s+");
            max = Math.max(max,strArr.length);
        }
        return max;
    }
}