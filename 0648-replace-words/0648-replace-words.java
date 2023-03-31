class Solution {
    
     class TrieNode{
        boolean isEnd;
        TrieNode[] children;
        
        public TrieNode(){
            children = new TrieNode[26];
        }
    }
    
     TrieNode root;
    
        public void insert(String word) { //o(1)
        TrieNode curr = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(curr.children [c-'a'] == null){
                curr.children[c-'a'] = new TrieNode();
            }
            curr = curr.children[c-'a'];
        }
        curr.isEnd = true;
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        for(String str: dictionary){
            insert(str);
        }
        StringBuilder result = new StringBuilder();
        StringBuilder replacement = new StringBuilder();
        String[] strArr = sentence.split(" ");
        for(String word: strArr){ 
            TrieNode curr = root;
            replacement = new StringBuilder();
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                if(curr.children [c-'a'] == null || curr.isEnd) break;
                replacement.append(c);
                curr = curr.children[c-'a'];      
            }    
            
                if(curr.isEnd){
                    result.append(replacement);
                    result.append(" ");
                }else{
                    result.append(word);
                    result.append(" ");
                }
            }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
        }
         
    }
