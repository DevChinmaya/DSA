
//Bubble Sort works like bubbles in water.The largest elements slowly rise (bubble up) to the end of the array after each pass.
//The algorithm repeatedly compares adjacent elements and swaps them if they are in the wrong order.

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,4,2,3,2,21,4,6,2,5,1,6};
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
