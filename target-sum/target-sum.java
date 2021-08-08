class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0,n=nums.length;
        
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
         if((sum+target)%2!=0) return 0;
        int s1=(sum+target)/2;
        int[][] arr = new int[n+1][s1+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<s1+1;j++){
                if(i==0) arr[i][j]=0;
                if(j==0) arr[i][j]=1;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<s1+1;j++){
                if(nums[i-1]<=j) arr[i][j]=(arr[i-1][j-nums[i-1]]+arr[i-1][j]);
                else arr[i][j]=arr[i-1][j];
            }
        }
        return arr[n][s1];
}

}