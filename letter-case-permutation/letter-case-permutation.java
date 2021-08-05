class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> l=new ArrayList<>();
        permute(s,"",l);
        return l;
    }
    void permute(String s,String ans,List<String> l){
        if(s.length()==0){
            l.add(ans);
            return;
        }
        char c=s.charAt(0);
        if(Character.isDigit(c)){
            permute(s.substring(1),ans+c,l);
        }else{
            permute(s.substring(1),ans+Character.toLowerCase(c),l);
            permute(s.substring(1),ans+Character.toUpperCase(c),l);
        }
    }
}