/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode node = head;
        while(node != null) {
            stack.push(node.val);
            node = node.next;
        }
        ListNode second = head;
        while(second != null) {
            if(stack.peek() == second.val) {
                stack.pop();
                second = second.next;
            } else {
                return false;
            }
        }
        return true;
    }
}