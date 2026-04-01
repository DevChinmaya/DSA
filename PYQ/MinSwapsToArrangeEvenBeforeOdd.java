//Find the minimum swaps required to arrange even numbers to the front
//I/P:{2,1,4,3,6,5,8}
//O/P: [2, 4, 6, 8, 1, 5, 3]
//     Minimum swaps required: 3


import java.util.Arrays;
public class MinSwapsToArrangeEvenBeforeOdd {
    public static void main(String[] args) {
        int[] a={2,1,4,3,6,5,8};
        int i=0,j=1;
        int swap=0;
        while(i<a.length && j<a.length && i<j){
            if(a[i]%2!=0){
                if(a[j]%2!=0){
                    j++;
                }else{
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    swap++;
                    i++; j++;
                }
            }else{
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Minimum swaps required: "+swap);
    }
}

    //Wrong program
    // public static void main(String[] args) {
    //     int[] a={2,1,4,3,6,5,7};
    //     int i=0,j=1;
    //     int swap=0;
    //     while(i<a.length && j<a.length && i<j){
    //         if(a[i]%2==0 && a[j]%2!=0){
    //             int temp=a[i];
    //             a[i]=a[j];
    //             a[j]=temp;
    //             i++; j++;
    //             swap++;
    //         }
    //         else if(a[i]%2==0) i++;
    //         else if(a[i]%2!=0 && a[j]%2!=0) j++;
    //     }
    //     System.out.println(swap);
    // }

