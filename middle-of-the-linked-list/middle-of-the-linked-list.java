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
    public ListNode middleNode(ListNode head) {
        ListNode  s = head;
        ListNode  f = head;
        ListNode  t = head;
        int size=0;
        while(t!=null){
            t=t.next;
            size++;
        }
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(size%2==0){
            return s.next;
        }else{
            return s;
        }
        
    }
}