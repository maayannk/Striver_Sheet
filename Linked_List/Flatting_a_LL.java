                                            <--Brute-->
     class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
       Node temp = root;
       ArrayList<Integer> l = new ArrayList<>();
       while(temp!=null){
           Node bot = temp;
           while(bot!=null){
               l.add(bot.data);
               bot=bot.bottom;
           }
           temp=temp.next;
       }  
       Collections.sort(l);
      Node dummy = new Node(-1);
      Node dumhead = dummy;
      for(int it : l){
          Node newnode = new Node(it);
            dumhead.bottom=newnode;
            dumhead.next=null;
            dumhead=dumhead.bottom;
          
      }
      
      return dummy.bottom;
    }
}

                                         <---Optimal--->
                        <---With the help of the backtracking and recursion--->
                        
class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        if(root==null || root.next==null) return root;
        Node mergehead = flatten(root.next);
        
        return merger(root,mergehead);
    }
    
    Node merger(Node l1 , Node l2){
        Node dummynode = new Node(-1);
        Node res = dummynode;
        while(l1!=null && l2!=null){
            if(l1.data<l2.data){
                res.bottom = l1;
                res=l1;
                l1=l1.bottom;
            }else{
                res.bottom=l2;
                res=l2;
                l2=l2.bottom;
            }
        }
        
        if(l1!=null) res.bottom=l1;
        if(l2!=null) res.bottom=l2;
        
        
        return dummynode.bottom;
    }
}                      