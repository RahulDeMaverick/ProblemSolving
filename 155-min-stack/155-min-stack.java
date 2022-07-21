class MinStack {
    
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minst = new Stack<>();
    private int min;

    public MinStack() {
        min = Integer.MAX_VALUE;
        minst.push(min);
    }
    
    public void push(int val) {
         if (val < min) {
            min = val;
        }
        st.push(val);
        minst.push(min);
    }
    
    public void pop() {
        st.pop();
        minst.pop();
        min = minst.peek();
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */