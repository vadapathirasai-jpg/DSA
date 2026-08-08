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
    ListNode reverseList(ListNode head){
        if(head == null){return null; }
        ListNode rl = null;
        while(head != null){
            ListNode temp = head;
                     head = head.next;
                     temp.next = rl;
                     rl = temp;
        }
        return rl;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        head = reverseList(head);
        if(n == 1){
            head = head.next;
            return reverseList(head);
        }
        ListNode p = head;
        for(int i = 1; i < n - 1; i++){
            p = p.next;
        }
        p.next = p.next.next;
        head = reverseList(head);
        return head;
    }
}