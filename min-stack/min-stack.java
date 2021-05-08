class MinStack {

    /** initialize your data structure here. */
    private int[] data;
    private int top;
    public static final int default_cap = 10000000;
    public MinStack(){
            this(default_cap);
        
    }
    public MinStack(int val){
            this.data=new int[val];
            this.top=-1;
    }
    public int size(){
        return this.top+1;
    }
    public boolean isEmpty(){
        return this.size()==0;
    }
    public void push(int val){
        if(this.size()==data.length){
            System.out.print("Index out of bound");
        }
        this.top++;
        this.data[this.top]=val;
    }
    public int pop(){
        if(this.size()==0){
            System.out.println("stack is empty");
        }
        int v=this.data[this.top];
        this.data[this.top]=0;
        this.top--;
        return v;
    }
    public int top(){
        if(this.size()==0){
            System.out.println("stack is empty");
        }
        return this.data[this.top];
    }
    public int getMin(){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<this.size();i++){
            if(this.data[i]<min){
                min=this.data[i];
            }
        }
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