//Q)Rotate an array by k times to the right
//Input: {1,2,3,4,5};  k=2;
//Output: {3,4,5,1,2}

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};//{3,4,5,1,2}
        int k = 17;
        k = k % arr.length; // Handle cases where k is greater than array length
        reverse(arr, 0, k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr, 0, arr.length-1);    
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[]arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
