// with the extra space
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> mp = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            if(mp.containsKey(temp)){
                return temp;
            }
            mp.put(temp,1);
            temp=temp.next;
        }

        return null;
    }
}

// without extra space
// used the slow and fast pointers
// after detecting the loop both will increase by 1
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return fast;
            }
        }
        return null;
    }
}