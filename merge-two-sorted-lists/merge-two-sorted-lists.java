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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode c1=l1,c2=l2;
        int x=0,y=0;
        if(c1==null){
            return c2;
        }else if(c2==null){
            return c1;
        }
        ListNode head;
        if(c1.val<c2.val){
            head = c1;
            c1 = c1.next;
        }else{
            head = c2;
            c2 = c2.next;
        }
        ListNode curr=head;
        while(c1!=null || c2!=null){
            if(c1!=null && c2!=null){   
                if(c1.val>c2.val){
                curr.next=c2;
                c2=c2.next;   
            }else{
                curr.next=c1;
                c1=c1.next; 
            }}else{
                if(c1==null && c2!=null){
                curr.next=c2;
                c2=c2.next; 
                }else{
                curr.next=c1;
                c1=c1.next;
                }
            }
        curr=curr.next;
    
        }
        return head;
    }
}
