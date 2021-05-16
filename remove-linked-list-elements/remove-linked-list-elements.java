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
    public ListNode removeElements(ListNode head, int v) {
        ListNode curr = head;
        if(head==null){
            return null;
        }
        while(curr.next!=null){
            if(curr.next.val==v){
               curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        if(head.val==v){
            return head.next;
        }
        return head;
    }
}