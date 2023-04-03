class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        //frequecty map for s
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        //result stringbuilder to append result
        StringBuilder sb = new StringBuilder();
        //iterate over order
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            //if the order is present in the frequecy map
            if(map.containsKey(c)){
                //append that character till the count of the character present in the frequecy map
                int count = map.get(c);
                for(int k=0;k<count;k++){
                    sb.append(c);
                }
                //after appending remove the character from c
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