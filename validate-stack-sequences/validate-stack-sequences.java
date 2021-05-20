class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int i=0,j=0;
        while(i<pushed.length){           
            s.push(pushed[i]);
               while(!s.isEmpty() && s.peek()==popped[j] && j<popped.length) {
                   s.pop();
                   j++;
               }
            i++;
        }    
        
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}