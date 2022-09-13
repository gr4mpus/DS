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
    public boolean isInRange(int val, int low, int high) {
        if(val >= low && val <= high) {
            return true;
        }
        return false;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) {
            return 0;
        }
        
        int sum = rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
        if(isInRange(root.val, low, high)) {
            sum+= root.val;
        }
        return sum;
    }
}