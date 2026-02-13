import java.util.*;

class a1{
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,5,3,2,1};
        arr[0]=1;
        arr[1]=3;
        arr[2]=2;
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}