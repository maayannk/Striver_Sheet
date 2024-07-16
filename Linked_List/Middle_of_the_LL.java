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

    // With the Count of the Linked List

    class Solution {
    public ListNode middleNode(ListNode head) {
     int count =0;
     ListNode cur = head;
     while(cur!=null){
        count++;
        cur=cur.next;
     }
        ListNode temp = head;
        for(int i =0; i<count/2 ; i++){
            temp=temp.next;
        }

        return temp;
    }
}



    // With the slow ans fast Pointers
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }

        return slow;
    }
}