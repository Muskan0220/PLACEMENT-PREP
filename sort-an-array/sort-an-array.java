class Solution {
    public int[] sortArray(int[] nums) {
        int n,min,idx=-1;
        for(int i=0;i<nums.length;i++){
            n=nums[i];
            min=nums[i];
            idx=-1;
            for(int j=i;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    idx=j;
                }
            }
            if(idx!=-1){
                int temp = nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
            }
        }
        return nums;
    }
}