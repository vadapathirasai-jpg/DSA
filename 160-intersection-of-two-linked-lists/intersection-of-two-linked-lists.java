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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        while(p.next != null){
            p = p.next;
        }
        p.next = headB;
        ListNode slow = headA, fast = headA;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                break;
            }
        } 

        if(slow != fast){
            p.next = null;
            return null;
        }
        ListNode p1 = headA, p2 = slow;
        while( p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        p.next = null;
        return p1;
    }
}