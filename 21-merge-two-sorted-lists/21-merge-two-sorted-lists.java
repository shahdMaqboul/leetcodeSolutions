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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l = new ListNode();
        ListNode head = l;
        
        while(list1 != null || list2!=null){
            if(list1 ==null){
                l.next=list2;
                break;
            }else if(list2==null){
                l.next=list1;
                break;
            }
            
            if(list1.val<=list2.val){
                l.next=list1;
                list1=list1.next;
                // l=l.next;
            }else if (list1.val>list2.val){
                l.next=list2;
                list2=list2.next;
                // l=l.next;
            }
            
            l=l.next;
            
        }
        return head.next;//first element = 0
    }
}