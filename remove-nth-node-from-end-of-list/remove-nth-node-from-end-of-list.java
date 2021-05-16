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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=new ListNode(0);
        prev.next=head;
        ListNode curr = head;
        int length=0;
        while(curr!=null){
            length++;
            curr=curr.next;
        }
        length=length-n;
        curr=prev;
        for(int i=1;i<=length;i++){
            curr=curr.next;
        }
        curr.next = curr.next.next;
        return prev.next;
    }
}