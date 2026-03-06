import java.util.Stack;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,1,3,4,2,2,3};
        System.out.println(EquiIndex(arr));

    }
    public static int EquiIndex(int[] arr){
        int n = arr.length;
        int sum=0;
        int lsum=0;
        int rsum=0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        for(int i=0; i<n; i++){
            lsum += arr[i];
            rsum = sum - lsum;
            if(lsum == rsum){
                
            }
        }
    }
    

    //Not passing every test cases
    // public static int EquiIndex(int[] arr){
    //     Stack<Integer> st = new Stack<>();
    //     int n = arr.length;
    //     int sum=0;
    //     int sum2=0;
    //     int stsum=0;
    //     for(int i=0; i<n; i++){
    //         sum += arr[i];
    //     }
    //     sum2 = sum/2;
    //     for(int i=0; i<n; i++){
    //         st.push(arr[i]);
    //         stsum+=arr[i];
    //         if(stsum > sum2){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}
