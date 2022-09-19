/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> parent = getList(root, p);
        return findCommonAncestor(q, parent);
    }
    
    public ArrayList<TreeNode> getList(TreeNode node, TreeNode p) {
        if(node == null) {
            return null;
        }
        if(node.val == p.val) {
            ArrayList<TreeNode> temp = new ArrayList<TreeNode>();
            temp.add(node);
            return temp;
        }
        ArrayList<TreeNode> left = getList(node.left, p);
        ArrayList<TreeNode> right = getList(node.right, p);
        if(left != null) {
            left.add(node);
            return left;
        }
        if(right != null) {
            right.add(node);
            return right;
        }
        return null;
    }
    
    public TreeNode findCommonAncestor(TreeNode q, ArrayList<TreeNode> parents) {
        for(TreeNode n: parents) {
            if(isNodePresent(n, q)) {
                return n;
            }
        }
        return null;
    }
    
    public boolean isNodePresent (TreeNode parent, TreeNode target) {
        if(parent == null) {
            return false;
        }
        
        if(parent.val == target.val) {
            return true;
        }
        
        boolean left = isNodePresent(parent.left, target);
        boolean right = isNodePresent(parent.right, target);
        
        return left || right;
    }
    
    
}