class Solution {
    public int[] maxSlidingWindow(int[] a, int k) {
        Deque<Integer> q = new LinkedList<>();
        List<Integer> l = new ArrayList<>();
        int i;
        for(i=0;i<k;i++){
            while(!q.isEmpty() && a[i]>a[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        for(;i<a.length;i++){
            l.add(a[q.getFirst()]);
            while(!q.isEmpty() && q.getFirst()<=i-k){
                q.removeFirst();
            }
            while(!q.isEmpty() && a[i]>a[q.getLast()]){
                q.removeLast();
            }
            q.addLast(i);
        }
        l.add(a[q.getFirst()]);
        int arr[]=l.stream().mapToInt(j -> j).toArray();
        return arr;
    }
}