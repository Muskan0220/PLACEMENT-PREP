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
    public ListNode swapNodes(ListNode head, int n) {
        ListNode curr = head;
        int a=0,b=0,c=0;
        int k=0;
        while(curr!=null){
            k++;
            curr=curr.next;
        }
        curr=head;
        if(k==2){
            int temp=curr.val;
            curr.val=curr.next.val;
            curr.next.val=temp;
            return head;
        }
        for(int i=1;i<=k && curr!=null;i++){
            if(i==n){
                a=curr.val;
                System.out.println(a);
                break;
            }
            curr=curr.next;
        }
        c=k-n+1;
        curr=head;
        for(int i=1;i<=c && curr!=null;i++){
            if(i==c){
                b=curr.val;
                System.out.println(b);
                curr.val=a;
                System.out.println(curr.val);
                break;
            }
            curr=curr.next;
        }
        curr=head;
        for(int i=1;i<=k && curr!=null;i++){
            if(i==n){
                curr.val=b;
                System.out.println(curr.val);
                break;
            }
            curr=curr.next;
        }
        return head;
    }
}