class MyCircularDeque {
    int max_size;
   ArrayDeque<Integer> dq;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.dq=new ArrayDeque<>();
        this.max_size=k;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(!this.isFull()){
            dq.addFirst(value);
            return true;
        }
        return false;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
         if(!this.isFull()){
            dq.addLast(value);
            return true;
        }
        return false;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(!this.isEmpty()){
            dq.removeFirst();
            return true;
        }
        return false;
        
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(!this.isEmpty()){
            dq.removeLast();
            return true;
        }
        return false;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(!this.isEmpty()){
            return dq.getFirst();
        }
        return -1;
        
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(!this.isEmpty()){
            return dq.getLast();
        }
        return -1;
        
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return dq.isEmpty();
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return dq.size()== this.max_size;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */