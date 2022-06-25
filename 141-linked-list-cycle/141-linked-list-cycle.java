/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null ) return false;
        
        Set<ListNode> set = new HashSet<ListNode> (); 
        ListNode n = head;
        while(n.next != null){
            if(set.contains(n)){
                return true;
            }
               set.add(n);
               n = n.next;
        }
        return false;
        
    }
}