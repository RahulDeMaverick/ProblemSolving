class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
    Map<Integer,Integer> map = new TreeMap<>();
        
        for(int[] interval: intervals){
            map.put(interval[0], map.getOrDefault(interval[0],0)+1);
            map.put(interval[1],map.getOrDefault(interval[1],0)-1);
        }
        
        int count =0;
        int result =0;
        for(int key : map.keySet()){
            count+= map.get(key);
            result = Math.max(count,result);
        }
        return result;
    }
}