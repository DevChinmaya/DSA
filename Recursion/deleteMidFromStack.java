import java.util.*;
public class deleteMidFromStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        Stack<Integer> temp = new Stack<>();
        int count=0 ,  size=stack.size();

        System.out.println("Original Stack: " + stack);
        deleteMiddle(stack,temp,count,size);
        System.out.println("Stack after deleting middle element: " + stack);
    }
    public static void deleteMiddle(Stack<Integer> stack,Stack<Integer> temp,int count,int size) {
        if(count == size/2){
            stack.pop();
            while(!temp.isEmpty()){
                stack.push(temp.pop());
            }
            return ;
        }
        count++;
        temp.push(stack.pop());
        deleteMiddle(stack, temp, count, size);
    }   
}
