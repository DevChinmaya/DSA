import java.util.Stack;

public class FirstMaxToLeft {

    public static void main(String[] args) {
        int arr[] = {3,2,5,3,4,5,8,1,6,2};
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int [] res = new int[n];
        st.push(arr[0]);
        for(int i=0; i<n; i++){ 
            // if(st.empty()){
            //     res[i] = -1;
            // }else if(st.peek() > arr[i]){
            //     res[i] = st.peek();
            //     st.push(arr[i]);
            // }else{
            //     st.pop();
            //     if(st.peek() > arr[i]){
            //         res[i] = st.peek();
            //     }
            // }
        // for(int i=0; i<n; i++){ 
        //     System.out.print(res[i]+" ");
        //  }
            if(i == 0){
                System.out.println(-1);
            }
            while(!st.isEmpty()){
                if(st.peek() > arr[i]){
                    System.out.println(st.peek());
                    break;
                }
                st.pop();
            }
            st.add(arr[i]);
        }
    }
    // public static void main(String[] args) {
    //     int arr[] = {3,2,5,3,4,5,8,1,6,2};
    //     int n = arr.length;
    //     int res[] = new int[n];
    //     for(int i=n-1; i>=0; i--){
    //         //res[i] = -1;
    //         for(int j=i-1; j>=0; j--){
    //             if(arr[i]<arr[j]){
    //                 res[i] = arr[j];
    //                 break;
    //             }else{
    //                 res[i] = -1;
    //             }
    //         }
    //     }
    //     for(int i=0; i<n; i++){ 
    //         System.out.print(res[i]+" ");
    //     }
    // }
}


//if st.empty()->return -1 and add the ele into st
// if st.top() > arr[i] then return st.top() and add the ele into st
// if st.top() < arr[i] then st.pop() and check next st.top()