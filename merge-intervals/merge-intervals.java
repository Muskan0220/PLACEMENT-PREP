class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
                return intervals;
            }
        Arrays.sort(intervals,(a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> res = new LinkedList<>();
        for(int[] i:intervals){
            if(res.isEmpty()||i[0]>res.getLast()[1]){
                res.add(i);
            }
            if(i[1]>res.getLast()[1]){
               res.getLast()[1]=i[1];
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}