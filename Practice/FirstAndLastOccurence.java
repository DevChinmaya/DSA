//Finding the first and last occurrence of an element in a sorted array
//[1, 2, 2, 2, 3, 4, 5] , target=2
//First occurrence = 1
//Last occurrence = 3
public class FirstAndLastOccurence {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int first = firstOccurence(arr, target);
        int last = lastOccurence(arr, target);
        System.out.println("First Occurence: " + first);
        System.out.println("Last Occurence: " + last);
    }
    public static int firstOccurence(int arr[], int target) {
        int low=0;
        int high=arr.length-1;
        int result=-1;
        int mid = (low + high)/2;
        while(low<=high){
            if(arr[mid] == target){
                result = mid;
                high = mid-1;
            }else if(arr[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return result;
    }
    public static int lastOccurence(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;
        int mid = (low+high)/2;
        while(low <= high){
            if(arr[mid] == target){
                result = mid;
                high=mid-1;
            }else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
}

