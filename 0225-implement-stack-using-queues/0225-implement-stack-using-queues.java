class MyStack {
    Queue<Integer> q;
    int top;

    public MyStack() {
        q= new LinkedList<>();
        top =0;     
    }
    
    public void push(int x) {
        q.add(x);
        top =x;
        
    }
    
    public int pop() {
        int size = q.size();
        while (size > 2) {
            q.add(q.poll());
            size--;
        }
        top = q.peek();
        q.add(q.poll());
        return q.poll();
    }
    
    public int top() {
        return top;
        
    }
    
    public boolean empty() {
        return q.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */