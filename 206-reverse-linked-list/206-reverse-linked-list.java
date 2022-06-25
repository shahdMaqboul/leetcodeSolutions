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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        
        Stack<ListNode> s = new Stack<ListNode>();
        ListNode n = head;
        
        while(n.next!=null){
            s.push(n);
            n = n.next;
        }
        
        head=n;
        
        while(!s.empty()){
            n.next = s.pop();
            n.next.next = null; //to avoid having circular linked list, beacuse we pop the node having value and next
            n=n.next;
        }
        
        return head;
        
    }
}