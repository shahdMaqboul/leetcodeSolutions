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
        if(head==null || head.next==null) return true;
        
        Stack<Integer> s = new Stack<Integer>();
        ListNode n1 = head;
        ListNode n2 = head;
        
        while(n2 != null && n2.next!= null ){
            s.push(n1.val);
            n1=n1.next;
            n2=n2.next.next;
            if(n2 != null && n2.next==null){ //odd number of nodes
                n1=n1.next;
            }
        }
        
        for(int i=0;i<=s.size();i++){
            if(n1.val != s.pop()) return false;
            n1=n1.next;
        }

        return true;
    }
    
}