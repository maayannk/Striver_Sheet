// With the extra memory 
class Solution {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.val = s.pop();
            temp=temp.next;
        }

        return head;
    }
}

// Without extra memory
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode temp = head;
        ListNode front = null;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }

        return prev;
    }
}