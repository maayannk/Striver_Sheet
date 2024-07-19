class Solution
{
    public static int helper(Node temp){
        if(temp==null){
            return 1;
        }
        int carry = helper(temp.next);
        temp.data = temp.data + carry;
        if(temp.data < 10){
            return 0;
        }
        temp.data =0;
        return 1;
    }
    public static Node addOne(Node head) 
    { 
        //code here.
        int carry = helper(head);
        if(carry==1){
            Node temp = new Node(1);
            temp.next = head;
            return temp;
        }
        
        return head;
        
    }
}