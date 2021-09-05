class Solution {
    public int countCharacters(String[] words, String chars) {
        int count[]=new int[26];
        for(int i=0;i<chars.length();i++){
            count[chars.charAt(i)-'a']++;
        }
        int res=0;
        for(int i=0;i<words.length;i++){
            int temp[]=count.clone();
            if(isGood(words[i].toCharArray(),temp)){
                res=res+words[i].length();
            }
        }
        return res;
    }
    public boolean isGood(char[] chars, int[] charCount) {
        for (char c : chars) {
            if (charCount[c - 'a']-- <= 0) {
                return false;
            }
        }

        return true;
    }
}