class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        String st[] = s.split(" ");
        int size,n;
        if(st.length==1 || st.length==0){
            return s.length();
        }else{
            n=st.length;
            return st[n-1].length();
        }
    }
}