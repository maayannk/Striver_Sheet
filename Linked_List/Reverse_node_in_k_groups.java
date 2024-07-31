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
    public ListNode findNode(ListNode temp ,int k){
          k=k-1;
          while(temp!=null && k>0){
            k--;
            temp=temp.next;
          }
          return temp;
    }
    public ListNode reverseLL(ListNode head){
        ListNode temp = head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode nxtnode = null;
        ListNode prevnode = null;
        while(temp!=null){
             ListNode kNode = findNode(temp,k);
             if(kNode==null){
                if(prevnode!=null)  prevnode.next=temp;
                break;
             }
            nxtnode = kNode.next;
            kNode.next=null;
            reverseLL(temp);
            if(temp==head){
                head=kNode;
            }else{
                prevnode.next = kNode;
            }
            prevnode=temp;
            temp=nxtnode;
        } 

        return head;       
    }
}