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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode c1 = l1,curr=dummy;
        ListNode c2 = l2;
        int carry=0;
        int x=0,y=0;
        while(c1!=null || c2!=null){
            if(c1!=null){x=c1.val;}else{x=0;}
            if(c2!=null){y=c2.val;}else{y=0;}
            int sum = carry+x+y;
            carry=sum/10;
            curr.next = new ListNode(sum%10);
            curr=curr.next;
            if(c1!=null){c1=c1.next;}
            if(c2!=null){c2=c2.next;}
        }
        if(carry>0){
            curr.next=new ListNode(carry);
        }
        return dummy.next;
    }
}