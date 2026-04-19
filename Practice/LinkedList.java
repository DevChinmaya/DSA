public class LinkedList {
    Node head;
    public void add(Object ele){
        Node n=new Node(ele);
        if(head==null){
            head=n;
            return;
        }
        Node curr=head;
        while(curr.next != null){
            curr=curr.next;
        }
        curr.next=n;
    }
    public void remove(Object ele){
        Node prev=null;
        Node curr=head;
        if(head==null){
            return;
        }   
        if(head.ele.equals(ele)){
            head=head.next;
            return;
        }
        while(curr != null){
            if(curr.ele.equals(ele)){
                prev.next=curr.next;
                curr.next=null;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.ele);
            curr=curr.next;
        }
    }
    public void linkToNode(int index){
        if(head==null)return;
        Node curr=head;
        Node temp=null;
        int count=1;
        while(curr!=null){
            if(count == index){
                temp=curr;
            }
            if(curr.next==null)break;
            count++;
            curr=curr.next;
        }
        if(temp!=null)
            curr.next=temp;
    }
    public void breakChain(){
        Node slow=head;
        Node fast = head;
        if(head==null)return;
        //find Chain
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast)break;
        }
        //find start of chain
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        //Break
        Node start=slow;
        Node end=slow;
        while(end.next != start){
            end=end.next;
        }
        end.next=null;
    }
    public void reverseLL(){
        if(head==null)return;
        Node curr=head;
        Node prev=null;
        while(curr != null){
            Node front=curr.next;
            curr.next=prev;
            head=front;
            prev=curr;
            curr=front;
        }
        head=prev;
    }
}
