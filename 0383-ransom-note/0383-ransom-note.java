class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : magazine.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
        int len = ransomNote.length();
        for(char c: ransomNote.toCharArray()){
            if(map.containsKey(c) && map.get(c) !=0){
                len--;
                map.put(c,map.get(c)-1);
            }else{
                return false;
            }
            
        }
        return len == 0;
        
    }
}