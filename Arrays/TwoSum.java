import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 10, 3};
        int target = 7;
        int[] res = SumOfTwo(arr,target);
        for(int a:res){
            System.out.print(a+" ");
        }
    }
    //Optimal
    public static int[] SumOfTwo(int[] arr,int target){
       int n = arr.length;
       Arrays.sort(arr);
       int left = 0;
       int right = n-1;
       while(left < right){
          if(arr[left]+arr[right] == target){
              return new int[]{left,right};
          }else if(arr[left] + arr[right] > target){
              right--;
          }else{
              left++;
          }
       } 
       return new int[]{-1,-1};
    }



    //Better
    // public static int[] SumOfTwo(int[] arr,int target){
    //     HashMap<Integer,Integer> mpp = new HashMap<>();
    //     int n = arr.length;
    //     for(int i=0; i<n; i++){
    //         int num = arr[i];
    //         int more = target - arr[i];
    //         if(mpp.containsKey(more)){
    //             return new int[]{mpp.get(more),i};
    //         }
    //         mpp.put(arr[i], i);
    //     }
    //     return new int[]{-1,-1};
    // }


    //BruteForce
    // public static int[] SumOfTwo(int[] arr,int target){
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
