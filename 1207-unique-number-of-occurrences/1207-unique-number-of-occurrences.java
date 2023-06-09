class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i: arr){
            if(map.containsKey(i))
                 map.put(i,map.get(i)+1);
            else
                map.put(i,1);
        }   
        
        Set<Integer> uniqueValues = new HashSet<>(map.values());

        return uniqueValues.size() == map.size();
        }
}