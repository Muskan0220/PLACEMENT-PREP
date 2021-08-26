class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i;
        for (i = n - 1; i > 0; i--) 
        {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }
        if(i==0){
            Arrays.sort(nums);
            return;
        }else{
        int k=nums[i-1],min=i;
        for(int j=i+1;j<n;j++){
            if(nums[j]>k && nums[j]<nums[min]){
                min=j;
            }
        }
        int temp=nums[i-1];
        nums[i-1]=nums[min];
        nums[min]=temp;
        Arrays.sort(nums,i,n);
        }
        
    }
}