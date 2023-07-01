class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1= new HashMap<>();
        HashMap<Character,Integer> map2= new HashMap<>();
        int counter =0;
        for(int i=0;i<word1.length();i++){
            map1.put(word1.charAt(i),map1.getOrDefault(word1.charAt(i),0)+1);
            map2.put(word2.charAt(i),map2.getOrDefault(word2.charAt(i),0)+1);
        }
        
        for(int i=0;i<word1.length();i++){
            char c = word1.charAt(i);
            if(map1.containsKey(c) && map2.containsKey(c)){

          
                if(Math.abs(map1.get(c)-map2.get(c))>3) return false;
            } 
            if(map1.containsKey(c) && !map2.containsKey(c)){
                if(map1.get(c)>3)  return false;
            } 
            if(map2.containsKey(c) && !map1.containsKey(c)){
                if(map2.get(c)>3)  return false;
            }
            if(!map1.containsKey(word2.charAt(i))){
                if(map2.get(word2.charAt(i))>3) return false;
            }
            
        }
        
        
        return true;
    }
}