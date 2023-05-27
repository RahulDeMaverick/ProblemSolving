class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        int[] temp = new int[score.length];
        for(int i=0;i<score.length;i++){
            temp[i] = score[i];
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        Arrays.sort(temp);
        int len = temp.length;
        int val =1;
        for(int i= len-1; i >=0;i--){

             map.put(temp[i],val);
            val++;
        }
        int i=0;
        for(int n : score){
            if(map.get(n) == 1)
                result[i] = "Gold Medal";
            else if(map.get(n) == 2)
                result[i] = "Silver Medal";
            else if(map.get(n) == 3)
                result[i] = "Bronze Medal";
            else
                result[i] = String.valueOf(map.get(n));
                i++;
        }
        return result;
         
        
        
        
    }
}