/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */
/**
 * @param {ListNode} node
 * @return {void} Do not return anything, modify node in-place instead.
 */
var deleteNode = function(node) {
    node.val=node.next.val;
    node.next=node.next.next;
    
};

// solution:
//copy next node, then delete it

// reference
// https://duncan-mcardle.medium.com/leetcode-problem-237-delete-node-in-a-linked-list-javascript-6c2277d180bb