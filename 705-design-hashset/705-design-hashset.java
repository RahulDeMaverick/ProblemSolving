class MyHashSet {
  ArrayList map;
    public MyHashSet() {
        map = new ArrayList<>(); 
    }
    
    public void add(int key) {
      if(!map.contains(key))  
          map.add(key);
    }
    
    public void remove(int key) {
        if(map.contains(key))  
          map.remove(map.indexOf(key));
    }
    
    public boolean contains(int key) {
        return map.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */