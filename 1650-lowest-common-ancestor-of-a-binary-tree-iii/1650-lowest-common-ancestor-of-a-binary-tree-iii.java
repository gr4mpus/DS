/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    public Node lowestCommonAncestor(Node p, Node q) {
        Queue<Node> queue = new LinkedList<>();
        getPath(p, queue);
        while(queue.size() > 0){
            Node node = queue.remove();
            if(getParentPath(q, node)) {
                return node;
            }
        }
        return null;
    }
    
    public void getPath(Node p, Queue<Node> queue) {
        if(p == null) {
            return;
        }
        queue.add(p);
        getPath(p.parent, queue);
    }
    
    public boolean getParentPath(Node q, Node parent) {
        if(parent == null) {
            return false;
        }
        if(parent.val == q.val) {
            return true;
        }
        boolean left = getParentPath(q, parent.left);
        boolean right = getParentPath(q, parent.right);
        return left || right;
    }
}