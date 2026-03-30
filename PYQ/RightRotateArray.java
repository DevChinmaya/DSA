//Input: 1 2 3 4 5 , k=2
//Output: 4 5 1 2 3
import java.util.*;
public class RightRotateArray {
    public static void main(String[] args) {
        int[]a={1,2,3,4,5};
        int k=2;
        reverse(a,2);
        
    }
    public static void reverse(int[]a,int pos){
        int right=a.length-pos-1;
        int left = 0;
        while(left < right){
            int temp=a[left];
            a[left]=a[right];
            a[right] = temp;
            left++;
            right++;
        }
        System.out.println(Arrays.toString(a));
        //return a;
    }
    // public static void main(String[] args) {
    //     int[]a={1,2,3,4,5};
    //     int k=2;
    //     int[] temp = new int[a.length-k];
    //     for(int i=0; i<temp.length; i++){
    //         temp[i] = a[i];
    //     }
    //     int idx=0;
    //     for(int i=0; i<a.length; i++){
    //         if(i<k){
    //             a[i] = a[a.length-k+i];
    //         }
    //         else a[i] = temp[idx++];
    //     }
    //     System.out.println(Arrays.toString(a));
    // }
}
