class MyCircularQueue {
    private int[] arr;
    private int front,rear,cs,ms;
    public MyCircularQueue(int k) {
        this.arr=new int[k];
        this.cs=0;
        this.ms=k;
        this.front=0;
        this.rear=k-1;
        
    }
    
    public boolean enQueue(int val) {
        if(!this.isFull()){
            this.rear=(this.rear+1)%this.arr.length;
            this.arr[this.rear]=val;
            this.cs=this.cs+1;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() {
        if(!this.isEmpty()){
            this.front=(this.front+1)%this.arr.length;
            this.cs=this.cs-1;
            return true;
        }
        return false;
    }
    
    public int Front() {
        if(this.isEmpty()){
            return -1;
        }
         return this.arr[this.front];
    }
    
    public int Rear() {
        if(this.isEmpty()){
            return -1;
        }
        return this.arr[this.rear];
    }
    
    public boolean isEmpty() {
        return this.cs==0;
    }
    
    public boolean isFull() {
        return this.cs==this.ms;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */