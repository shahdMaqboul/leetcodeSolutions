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
        ListNode j;
        
        while(n.next!=null){
            s.push(n);
            n = n.next;
        }
        
        head=n;
        printList(head);
        
        while(!s.empty()){
            n.next = s.pop();
            n.next.next = null;
            n=n.next;
        }
        
        printList(head);
        
        return head;
        
    }
    void printList(ListNode node)
    {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }
}