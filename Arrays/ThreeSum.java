
public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 10, 3};
        int target = 6;
        int[] res = SumOfThree(arr,target);
        for(int a:res){
            System.out.print(a+" ");
        }
    }
    // public static int[] SumOfThree(int[] arr,int target){
    //     int n = arr.length;
    //     int[] res = new int[2];
    //     for(int i=0; i<n; i++){
    //         for(int j=i+1; j<n; j++){
    //             int sum = arr[i]+arr[j];
    //             if(sum == target){
    //                 res[0] = i;
    //                 res[1] = j;
    //                 return res;
    //             }
    //         }
    //     }
    //     return new int[]{-1,-1};
    // }
}