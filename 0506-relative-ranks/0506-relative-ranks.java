class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> score[b]-score[a]);
        for(int i=0;i<score.length;i++) pq.add(i);
        int i =1;
        while(!pq.isEmpty()){
            
            int val = pq.poll();
            if(i == 1) {
                result[val] = "Gold Medal";
                i++;
                       }
            else if(i == 2)
                {
                result[val] = "Silver Medal";
                i++;
                }
            else if(i == 3)
                {
                result[val] = "Bronze Medal";
                i++;
                }
            else
                result[val] = String.valueOf(i++);
        }
        return result;
    }
    
    /*  HashMap Solution
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
         
        
        
        
    */
}
