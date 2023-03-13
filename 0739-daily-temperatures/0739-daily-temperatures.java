class Solution {
    public int[] dailyTemperatures(int[] temp) {
        if(temp == null || temp.length == 0) return new int[0];
        int[] result = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<temp.length;i++){
            while(!st.isEmpty() && temp[i] > temp[st.peek()])
            {
                int popped = st.pop();
                result[popped] = i-popped;
            }
            st.push(i);
        }
        return result;
    }
}