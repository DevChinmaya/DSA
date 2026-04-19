public class LinkedList {
    Node head;   
    public void add(Object ele){
        Node n=new Node(ele);
        if(head==null){
            head=n;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=n;
    }
    public void circularLL(){
        Node slow=head;
        Node fast=head;
        if(head == null)return;
        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast) break;
        }
        slow=head;
        while(slow != fast){
            slow=slow.next;
            fast=fast.next;
        }
        Node st=slow;
        Node end=slow;
        while(end.next!=st){
            end=end.next;
        }
        end.next=null;
    }
    public void link(int pos){
        if(head==null)return;
        Node curr=head;
        Node temp=null;
        int count=1;
        while(curr!=null){
            if(pos==count){
                temp=curr;
            }
            if(curr.next == null){
                break;
            }
            count++;
            curr=curr.next;
        }
        if(temp != null){
            curr.next = temp;
        }
    }
    public void delete(Object ele){
        Node curr=head;
        Node prev=null;
        if(head.ele.equals(ele)){
            prev=head;
            head=head.next;
            prev.next=null;
            return;
        }
        while(curr.next!=null){
            if(curr.ele.equals(ele)){
                prev.next=curr.next;
                curr.next=null;
                return;
            }
            prev=curr;
            curr=curr.next;
        }
        if(curr.ele.equals(ele)){
            prev.next=null;
        }
    }
    public void print(){
        Node curr=head;
        while(curr!=null){
            System.out.println(curr.ele);
            curr=curr.next;
        }
    }
}
