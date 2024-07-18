public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> mp = new HashMap<>();
        ListNode temp1 = headA;
        while(temp1!=null){
            mp.put(temp1,1);
            temp1=temp1.next;
        }
        ListNode temp2 = headB;
        while(temp2!=null){
            if(mp.containsKey(temp2)){
                return temp2;
            }
            mp.put(temp2,1);
            temp2=temp2.next;
        }

        return null;

    }
}