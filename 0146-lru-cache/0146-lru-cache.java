//time and space in o(1);

class LRUCache {
    //initiate a Node
    //queue dont work we cant get values in o(1);
    //create a map with key and node instead of values to get access to the node in 0(1)
    // we need to remove item and add item in o(1) so we need doubly linked list
    class Node {
        int key; int val;
        Node prev;
        Node next;
        
        public Node(int key,int val){
            this.key = key;
            this.val = val;
        }  
    }
    
    //remove the node from its position
    private void remove(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    //add the node to the head
    //always do operations to independnt node
    private void addToHead(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    
    //hashmap with key and node
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    int capacity;
    
    //constructor
    public LRUCache(int capacity) {
        this.map = new HashMap<>();
        //create a dummy head and dummy tail
        this.head = new Node(-1,-1);
        this.tail = new Node(-1,-1);
        //connect head and tail
        this.head.next = tail;
        this.tail.prev = head;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        //no key found in map then return -1
        if(!map.containsKey(key)) return -1;
        //get the node, remove the node and add it to the head to make it most recenty used
        Node node = map.get(key);
        remove(node);
        addToHead(node);
        //return the node value
        return node.val; 
    }
    
    public void put(int key, int value) {
        //if map contains the key get the node and replace node.val with the value 
        //remove node and add to head
        if(map.containsKey(key))
        {
            Node node = map.get(key);
            node.val = value;
            remove(node);
            addToHead(node);
        }
        //case for new node if key is not present
        else{ 
            //check the capacity if the capacity is equal to map.size then we need to remove tail prev node and add new node to head
            if(map.size() == capacity){
                //tail prev node to free up space for new node
                Node tailprev = tail.prev;
                remove(tailprev);
                //remove form the map as well
                map.remove(tailprev.key);
            }
            //create new node with key and value
            Node newNode = new Node(key,value);
            //add to head
            addToHead(newNode);
            //add to map as well
            map.put(key,newNode);
        }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */