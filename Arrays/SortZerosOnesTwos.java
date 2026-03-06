public class SortZerosOnesTwos{
    public static void main(String[] args) {
        int[] arr={1,2,0,2,1,0,1,1,1,0,2};
        OptimalSort(arr);
        for(int a:arr){
            System.out.print(a+" ");
        }
    }
    //Optimal approach
    public static int[] OptimalSort(int[]arr){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }

    //BETTER APPROACH
    public static int[] betterSort(int[]arr){
        int n=arr.length;
        int cnt0=0, cnt1=0, cnt2=0;
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                cnt0++;
            }else if(arr[i]==1){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        for(int i=0; i<n; i++){
            if(cnt0>0){
                arr[i]=0;
                cnt0--;
            }else if(cnt1 > 0){
                arr[i]=1;
                cnt1--;
            }else{
                arr[i] = 2;
                cnt2--;
            }
        }
        return arr;
    }
}