/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            List<List<Integer>> l = new ArrayList<List<Integer>>();
            return l;
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        boolean rev=false;
        q.add(root);
        while(!q.isEmpty()){
            int c=q.size();
            List<Integer> l=new ArrayList<Integer>();
            Stack<Integer> s = new Stack<>();
            for(int i=0;i<c;i++){
                TreeNode curr=q.poll();
                if(rev){
                    s.add(curr.val);
                }else{
                    l.add(curr.val);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            rev=!rev;
            while(!s.isEmpty()){
                l.add(s.pop());
            }
            list.add(l);
        }
        return list;
    }
}