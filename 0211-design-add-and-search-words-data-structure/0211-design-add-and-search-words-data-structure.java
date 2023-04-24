class WordDictionary {
    class TrieNode{
        boolean isEnd;
        TrieNode[] children;
        
        public TrieNode(){
            children = new TrieNode[26];
        }
    }
    
    TrieNode root;
    
    

    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
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
    
    public boolean search(String word) {
        return search(word,this.root,0);
        
    }
    
    private boolean search(String word, TrieNode node, int index){
        //recusively check if the word is present
        if (index == word.length()) return node.isEnd;
        
        if(word.charAt(index) != '.'){
            return (node.children[word.charAt(index) - 'a'] != null  && 
                   search(word, node.children[word.charAt(index) - 'a'], index+1));
        }else{
            for(TrieNode n : node.children){
                if (n != null && search (word, n, index+1)) return true; 
            }
            return false;
        }
        
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */