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
    public boolean isPalindrome(ListNode head) {
        ListNode p = head;
        Stack<Integer> st = new Stack<>();
        while(p != null){
            st.push(p.val);
            p = p.next;
        }
        p = head;
        while( p != null){
            if(p.val != st.pop()){
                return false;
            }
            p = p.next;
        }
        return true;
    }
}