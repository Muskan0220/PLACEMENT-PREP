class Solution {
    public int[] plusOne(int[] digits) {
        int flag=0;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                flag=1;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(flag==1)
            return digits;
        else{
            int[] arr=new int[digits.length+1];
            arr[0]=1;
            for(int i=0;i<digits.length;i++){
                arr[i+1]=digits[i];
            }
            return arr;
        }
    }
}