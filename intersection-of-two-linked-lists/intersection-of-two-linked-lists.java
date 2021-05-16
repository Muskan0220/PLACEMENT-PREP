/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode c1=h1;
        ListNode c2=h2;
        while(c1!=null){
            c2=h2;
            while(c2!=null){
            if(c1==c2){
                return c1;
            }else{
                c2=c2.next;
            }
            }

            c1=c1.next;
        }
        return null;
    }
}