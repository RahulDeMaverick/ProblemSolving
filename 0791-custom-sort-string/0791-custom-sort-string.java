class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        //frequecty map for s
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            if(map.containsKey(c)){
                int count = map.get(c);
                for(int k=0;k<count;k++){
                    sb.append(c);
                }
                map.remove(c);
            }
        }
        for(Character c: map.keySet()){
            int count = map.get(c);
            for(int k=0;k<count;k++){
                    sb.append(c);
                }
            
        }
        
        return sb.toString();
    }
}