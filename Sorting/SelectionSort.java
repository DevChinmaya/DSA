
public class SelectionSort {
    //Selection Sort repeatedly selects the smallest element from the unsorted part and moves it to the correct position.
    public static void main(String[] args) {
        int[] arr = {3,4,2,3,2,21,4,6,2,5,1,6};
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int mini = i;
            for(int j=i+1; j<n; j++){
                if(arr[mini] > arr[j]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp; 
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
