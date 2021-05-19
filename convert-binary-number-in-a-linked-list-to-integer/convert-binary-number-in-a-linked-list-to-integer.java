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
    public int getDecimalValue(ListNode head) {
        ListNode curr =head;
        int s=0;
        while(curr!=null){
            s++;
            curr=curr.next;
        }
        curr=head;
        int sum=0;
        for(int i=s-1;i>=0 && curr!=null;i--){
            // System.out.println((int)(Math.pow(2,i)*curr.val));
            sum= sum +(int)(Math.pow(2,i)*curr.val);
            curr=curr.next;
        }
        return sum;
    }
}