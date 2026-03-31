import java.util.Arrays;

public class MoveZerosToEnd {
     public static void main(String[] args) {
        int[] a={1, 0, 2, 0, 3, 0, 1, 9, 4, 0, 5, 5};
        int idx=0;
        for(int i=0; i<a.length; i++){
            if(a[i] != 0){
                a[idx++]=a[i];
            }
        }
        for(int i=idx;i<a.length; i++){
            a[idx++]=0;
        }
        System.out.println(Arrays.toString(a));
    }

    //This will move all the zeros to end but it will not maintain the order of non-zero elements
    // public static void main(String[] args) {
    //     int[] a={1, 0, 2, 0, 3};
    //     int i=0, j=a.length-1;
    //     while(i<j){
    //         if(a[i]==0 && a[j]!=0){
    //             int temp=a[i];
    //             a[i]=a[j];
    //             a[j]=temp;
    //             i++; j--;
    //         }else if(a[j]==0){
    //             j--;
    //         }else if(a[i]!=0 && a[j]!=0){
    //             i++;
    //         }
    //     }
    //     System.out.println(Arrays.toString(a));
    // }
}
