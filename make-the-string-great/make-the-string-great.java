class Solution {
    public String makeGood(String s) {
        Stack<Character> q =new Stack<>();
        for(int i=0;i<=s.length()-1;i++){
            if(q.isEmpty()){
                q.push(s.charAt(i));
            }else{
            char c = q.peek();
            int a = Math.abs((int)s.charAt(i) - (int)c);
            if(a==32){
                q.pop();
            }else{
                q.push(s.charAt(i));
            }       
            }

        }
        StringBuilder st = new StringBuilder();
        while(!q.isEmpty()){
            st.append(q.pop());
        }
        return st.reverse().toString();
    }
}