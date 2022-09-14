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
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Stack<TreeNode> stack = new Stack<>();
        while(root != null) {
            stack.push(root);
            List<Integer> leaves = new ArrayList<Integer>();
            while(!stack.empty()) {
                TreeNode node = stack.pop();
                if(node.left == null && node.right == null) {
                    leaves.add(node.val);
                    if(node == root) {
                        root = null;
                    }
                }
                if(node.right != null) {
                    stack.push(node.right);
                    if(node.right.left == null && node.right.right == null) {
                        node.right = null;
                    }
                }
                if(node.left != null) {
                    stack.push(node.left);
                    if(node.left.left == null && node.left.right == null) {
                        node.left = null;
                    }
                }
            }
            
            res.add(leaves);
        }
        return res;
    }
}