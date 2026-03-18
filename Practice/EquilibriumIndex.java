
public class EquilibriumIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,4,3,1,3,4,2,2,3};
        System.out.println(EquiIndex(arr));

    }
    //Optiimized Approach
    public static int EquiIndex(int[] arr){
        int n = arr.length;
        int sum=0;
        int lsum=0; 
        for(int i=0; i<n; i++){
            sum+= arr[i];
        }
        for(int i=0; i<n; i++){
            sum = sum - arr[i];
            if(sum == lsum){
                return i;
            }
            lsum = lsum + arr[i];
        }
        return -1;
    }
    //Brute Force Approach
    // public static int EquiIndex(int[] arr){
    //     int n = arr.length;
    //     int[] prefixSum = new int[n];
    //     prefixSum[0] = arr[0];
    //     int[] suffixSum = new int[n];
    //     suffixSum[n-1] = arr[n-1];
    //     for(int i=1; i<n; i++){
    //         prefixSum[i] = prefixSum[i-1] + arr[i]; 
    //     }
    //     for(int i=n-2; i>=0; i--){
    //         suffixSum[i] = suffixSum[i+1] + arr[i];
    //     }
    //     for(int i=0; i<n; i++){
    //         if(prefixSum[i] == suffixSum[i]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
}
