class Solution {
    public boolean rotateString(String A, String B) {
        if(A.equals(B)){
            return true;
        }
        StringBuilder s= new StringBuilder(A);
        for(int i=0;i<A.length();i++){
            char t=s.charAt(0);
            s.deleteCharAt(0);
            s.append(t);
            if((s.toString()).equals(B)){
                return true;
            }
        }
        return false;
    }
}