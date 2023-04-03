//sliding window solution
//TC & SC : O(N) where n is length of the string

//create a hasmap to save characters and index of the occurnce of the character
// two pointer take slow and past
//put the character in the map. if the element is already present move the slow pointer to escape the repeating character
// in example abcabcbb abc will go inside map. if a is encountered again then we move the slow pointer to escape a.
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        //slow pointer
        int slow =0;
        int max =0;
        //i is fast pointer
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                //slow is max between slow pointer and the character we encountered c+1
                slow = Math.max(slow, map.get(c)+1);
            }
            //max is calculated by i-slow, that + 1 is because of index
            max = Math.max(max,i-slow+1);
            map.put(c,i);
        }
        return max;
    }
}