class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for(String s:ops){
            if(s.equals("C") || s.equals("D")|| s.equals("+")){
                if(!stack.isEmpty()){
                if(s.equals("C")){stack.pop();}
                else if(s.equals("+")){
                    int s1=stack.pop();
                    int s2=stack.pop();
                    stack.push(s2);
                    stack.push(s1);
                    int sum = s1+s2;
                    stack.push(sum);                    
                }
                else if(s.equals("D")){
                    int s1=stack.pop();
                    stack.push(s1);
                    int sum = s1*2;
                    stack.push(sum);                    
                }
            }
                
                
            }else{
                stack.push(Integer.parseInt(s));
            }
            
        }
        int res=0;
        for(int i=0;i<stack.size();i++){
            res=res+stack.get(i);
        }
        return res;
        
    }
}