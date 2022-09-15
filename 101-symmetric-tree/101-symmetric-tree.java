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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return false;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        return compareSymmetry(left, right);
        
    }
    
    public boolean compareSymmetry (TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) {
            return true;
        }
        if(node1 == null || node2 == null) {
            return false;
        }
        
        boolean first = compareSymmetry(node1.left, node2.right);
        boolean second = compareSymmetry(node1.right, node2.left);
        if(node1.val == node2.val && (first && second)) {
            return true;
        }else {
            return false;
        }
        
        // return first && second;
    }
}