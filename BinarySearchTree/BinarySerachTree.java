public class BinarySerachTree {
    Node root;
    int count=0;
    boolean flag;
    public boolean add(int key){
        flag=true;
        root=add(root,key);
        return flag;
    }
    public Node add(Node n,int key){
        if(n==null){
            n=new Node(key);
            count++;
            return n;
        }
        if(key<n.key){
            n.left=add(n.left,key);
        }else if(key>n.key){
            n.right=add(n.right,key);
        }else{
            flag=false;
        }
        return n;
    }
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void preOrder(){
        preOrder(root);
    }
    public void preOrder(Node n){
        if(n==null) return;
        System.out.println(n.key);
        preOrder(n.left);
        preOrder(n.right);
    }
}
