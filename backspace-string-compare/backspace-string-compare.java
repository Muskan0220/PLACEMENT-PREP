class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(c);
            }
            
        }
        String str1=""; 
        while(!stack.isEmpty()){
            str1+=stack.pop();
        }
        stack.clear();
        for(int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if(c=='#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(c);
            }

        }
        String str2=""; 
        while(!stack.isEmpty()){
            str2+=stack.pop();
        }
        if(str1.equals(str2)){
            return true;
        }else{
            return false;
        }
        
    }
}