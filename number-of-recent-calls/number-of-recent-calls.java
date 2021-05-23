class RecentCounter {
    Queue<Integer> q;
    private int counter;
    public RecentCounter() {
        this.counter=0;
        this.q = new LinkedList<>();
    }
    
    public int ping(int t) {
        q.add(t);
        counter++;
        while(!q.isEmpty()){
            if(q.peek()>=(t-3000)){
                break;
            }
            counter--;
            q.poll();
        }
        return counter;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */