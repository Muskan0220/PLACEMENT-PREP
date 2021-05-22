class MyStack {
    Queue<Integer> p;
    Queue<Integer> s;
    /** Initialize your data structure here. */
    public MyStack() {
        this.p=new LinkedList<>();
        this.s=new LinkedList<>();
    }
    /** Push element x onto stack. */
    public void push(int x) {
            s.add(x);

            while (!p.isEmpty()) {
                s.add(p.peek());
                p.remove();
            }
        
            Queue<Integer> q = p;
            p = s;
            s = q;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(p.isEmpty()){
            return -1;    
        }
        
        return p.poll();
    }
    
    /** Get the top element. */
    public int top() {
        if(p.isEmpty()){
            return -1;    
        }
        return p.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return p.isEmpty();
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