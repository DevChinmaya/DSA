public class Node {
    Node right;
    Node left;
    int key;
    Node(int key){
        this.key=key;
    }
    public Node(Node left,Node right,int key){
        this.left=left;
        this.right=right;
        this.key=key;
    }
}
