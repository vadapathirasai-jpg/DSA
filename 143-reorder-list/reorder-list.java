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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return ;
        }
        //find mid
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tempList = slow.next;
        slow.next = null;
        //reverse
        ListNode list2 = null;
        while(tempList != null){
            ListNode temp = tempList;
                     tempList = tempList.next;
                     temp.next = list2;
                     list2 = temp;
        }
        //merge
        ListNode list1 = head;
        while(list1 != null && list2 != null){
            ListNode next1 = list1.next;
            ListNode next2 = list2.next;
                     list1.next = list2;
                     list2.next = next1;
                     list1 = next1;
                     list2 = next2;
        }



    }
}