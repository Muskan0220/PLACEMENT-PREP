class Solution {
    public boolean canPartition(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
                sum=sum+arr[i];
        }
        if(sum%2!=0){
            return false;
        }else{
            return isSubsetSum(n,arr,sum/2);
        }
        
    }
    public boolean isSubsetSum(int n, int arr[], int sum){
       boolean dp[][]=new boolean[n+1][sum+1];
       for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }
       for(int i=1;i<=n;i++){
           for(int j=1;j<=sum;j++){
               if(arr[i-1]<=j){
                   dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i-1]];
               }else{
                   dp[i][j]=dp[i-1][j];
               }
           }
           
       }
       return dp[n][sum];
    }
}