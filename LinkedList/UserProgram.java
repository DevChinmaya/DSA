public class UserProgram {
    Node head;
    Node slow=head;
    Node fast=head;
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);     
        //l.delete(50);
        l.link(3);
        l.circularLL();
        l.print();
    }
    // public void circularLL(){
    //     if(head == null)return;
    //     while(fast!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //         if(slow == fast) break;
    //     }
    //     slow=head;
    //     while(slow != fast){
    //         slow=slow.next;
    //         fast=fast.next;
    //     }
    //     Node st=slow;
    //     Node end=slow;
    //     while(end.next!=st){
    //         end=end.next;
    //     }
    //     end.next=null;
    // }
}