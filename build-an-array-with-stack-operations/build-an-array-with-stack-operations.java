class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<Integer> t =new ArrayList<>();
        for(int i=0;i<target.length;i++){
            t.add(target[i]);
        }
        List<String> list = new ArrayList<>();
        int c=0;
       for(int i=1;i<=n && c<t.size();i++){
                if(t.contains(i)){
                    c++;
                    list.add("Push");
                }else{
                    list.add("Push");
                    list.add("Pop");
                }
       }
    
        for(String s:list){
            System.out.println(s);
        }
        return list;
    }
}