class MyQueue {
    Stack<Integer> p;
    Stack<Integer> s;
    /** Initialize your data structure here. */
    public MyQueue() {
        this.p=new Stack<>();
        this.s=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        p.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while(!(p.size()==1)){
            s.push(p.pop());
        }
        int val =p.pop();
        while(!s.empty()){
            p.push(s.pop());
        }
        return val;
    }
    
    /** Get the front element. */
    public int peek() {
        while(!p.empty()){
            s.push(p.pop());
        }
        int val = s.peek();
        while(!s.empty()){
            p.push(s.pop());
        }
        return val;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return p.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */