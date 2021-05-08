class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        int n1=nums1.length;
        int n2=nums2.length;
        int a[]= new int[n1];
        Arrays.fill(a,-1);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n2; i++) {
            list.add(nums2[i]);
          }
        for(int i=0;i<nums1.length;i++){
            outerloop:
            for(int j=list.indexOf(nums1[i]);j<nums2.length;j++){
                while(!stack.isEmpty() && nums2[j]>stack.peek() && nums2[j]>nums1[i]){
                    int rv=stack.pop();
                    a[i]=nums2[j];
                    break outerloop;
                }
            stack.push(nums2[j]);
            }
            stack.clear();
            }
        return a;


    }
}