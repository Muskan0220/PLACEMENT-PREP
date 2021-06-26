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
    public int countNodes(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        count(root,res);
        return res.size();
    }
    void count(TreeNode root,ArrayList<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        count(root.left,res);
        count(root.right,res);
    }
}