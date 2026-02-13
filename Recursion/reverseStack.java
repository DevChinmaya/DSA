
import java.util.*;
public class reverseStack {
    public static void main(String[] args) {
        // Code to reverse a stack using recursion

        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        reverseStack(st);
        System.out.println(st);

    }
    public static void reverseStack(Stack<Integer> st) {
        // Implementation goes here
        if(st.empty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);
        insertBottom(st, top);
    }
    public static void insertBottom(Stack<Integer> st,int ele){

        if(st.empty()){
            st.push(ele);
            return;
        }

        int top = st.pop();
        insertBottom(st, ele);
        st.push(top);
    }

}
