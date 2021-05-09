class Solution {
    public int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for(String s:logs){
            if(s.equals("../")){
                if(!stack.isEmpty()){
                stack.pop();                  
                }
            }else if(s.equals("./")){
                continue;
                }else{
                stack.push(s);
            }
            }
        if(stack.isEmpty()){
            return 0;
        }else{
            return stack.size();
        }
    }
}