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
    public ListNode removeElements(ListNode head, int val) {
        ListNode p=head; 
        
        while(p!=null){
            if(p==head && p.val == val){
                head=head.next;
                p=head;
            }else if(p.next!=null && p.next.next==null){//last node-1
                if(p.next.val == val){
                    p.next=null;
                }
                break;
            }else if(p.next ==null){
                break;
            }else if(p.next.val==val){
                p.next=p.next.next;
            }else{
                p=p.next;
            }
        }
        
        return head;
    }
}