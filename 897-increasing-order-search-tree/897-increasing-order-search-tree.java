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
    Queue<TreeNode> q = new LinkedList<>();
    public TreeNode increasingBST(TreeNode root) {
        fillTree(root);
        root = q.remove();
        TreeNode prev = root;
        while(q.size() > 0) {
            TreeNode temp = q.remove();
            prev.left = null;
            prev.right = temp;
            prev = temp;
        }
        prev.left = null;
        return root;
    }
    
    public void fillTree(TreeNode node) {
        if(node == null) {
            return;
        }
        if(node.left != null) {
            fillTree(node.left);
        }
        q.add(node);
        if(node.right != null) {
            fillTree(node.right);
        }
        
    }
}