// With extra memory
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            s.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            int ans = s.pop();
            if(temp.val!=ans){
                return false;
            }
            temp=temp.next;
        }

        return true;
    }
}

// without extra memory